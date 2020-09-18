import MapReduce.MapReduce;
import MapReduce.SelectStructure;
import SymbolTable.*;
import Where_Cluese.*;
import from_clause.From_Clause;
import from_clause.From_Join;
import javafx.util.Pair;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import sun.reflect.generics.scope.Scope;

import java.util.ArrayList;
import java.util.List;

public class MyVisitor extends compilerBaseVisitor<Object> {
    private static final char DELIMITER = ',';
    SymbolTable test=new SymbolTable();
    MapReduce mp = new MapReduce();
    @Override public Object visitProgram(compilerParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }
    @Override public Object visitCreate_database_stmt(compilerParser.Create_database_stmtContext ctx) {
        Record temp=new Record(ctx.expr().getText(),"database");
        test.put(ctx.expr().getText(),temp);
        return visitChildren(ctx);
    }

    @Override public Object visitCreate_table_stmt(compilerParser.Create_table_stmtContext ctx) {
        ClassRecord temp=new ClassRecord(ctx.table_name().getText(),"table");
        compilerParser.Create_table_columnsContext cols=ctx.create_table_definition().create_table_columns();
        for(int i=0;i<cols.create_table_columns_item().size();i++) {
            compilerParser.Create_table_columns_itemContext t = cols.create_table_columns_item(i);
            if(test.ch_type(t.dtype().getText())){
                temp.addField(t.column_name().getText(),new Record(t.column_name().getText(),t.dtype().getText()));
            }
            else {
                System.out.print("error in the line "+ctx.getStart().getLine() + " : ");
                System.out.println(t.dtype().getText()+" undeclared type");
            }
        }
        test.put(ctx.table_name().getText(),temp);
        return visitChildren(ctx);
    }

    @Override public Object visitFullselect_stmt(compilerParser.Fullselect_stmtContext ctx) {
        int cnt=ctx.getChildCount();
        for(int i=0;i<cnt;i++){
            if(i%2==0){
                ///////full select stmt item
                Fullselect_stmt_item_Context(ctx.getChild(i));
            }
            else{
                ///////fullselect_set_clause
            }
        }
        return visitChildren(ctx);
    }

    private void Fullselect_stmt_item_Context(ParseTree a){
        while(a.getChild(0).getText().equals("("))
            a=a.getChild(1).getChild(0);
        a=a.getChild(0);
        /////// a sub select stmt
        compilerParser.Select_listContext select_list = (compilerParser.Select_listContext) a.getChild(1);

        ArrayList <String> arr_select_list = new ArrayList <> ();////array for store select list
        ArrayList <String> arr_from_list = new ArrayList <> ();/////array for store from list
        ArrayList <String> arr_group_list = new ArrayList<>();//////array for store group by list
        ArrayList <Pair<String,Pair<String,String>>> arr_agg_list = new ArrayList<>();//////array for store aggregate function
        ArrayList <Pair<String,List<String>>> arr_fun_list = new ArrayList<>();
        ArrayList <Expr> arr_Order_list = new ArrayList<>();
        for(int i=0;i<select_list.select_list_item().size();i++) {
            if (select_list.select_list_item(i).expr() != null)
            {
                if (select_list.select_list_item(i).expr().expr_atom() != null)
                    arr_select_list.add(select_list.select_list_item(i).getText());
                else if (select_list.select_list_item(i).expr().expr_agg_window_func() != null) {
                    if(select_list.select_list_item(i).expr().expr_agg_window_func().expr_func_all_distinct()!=null){
                        arr_agg_list.add(new Pair<>(select_list.select_list_item(i).expr().expr_agg_window_func().getChild(0).getText(),
                                new Pair<>(select_list.select_list_item(i).expr().expr_agg_window_func().expr_func_all_distinct().getText(),select_list.select_list_item(i).expr().expr_agg_window_func().expr(0).getText())));
                    }
                    else{
                        arr_agg_list.add(new Pair<>(select_list.select_list_item(i).expr().expr_agg_window_func().getChild(0).getText(),
                                new Pair<>("",select_list.select_list_item(i).expr().expr_agg_window_func().expr(0).getText())));
                    }
                }
                else if (select_list.select_list_item(i).expr().expr_func() != null) {
                    ArrayList<String> parameter = new ArrayList<>();
                    if(select_list.select_list_item(i).expr().expr_func().expr_func_params() != null){
                        for (int j=0;j<select_list.select_list_item(i).expr().expr_func().expr_func_params().func_param().size();j++){
                            parameter.add(select_list.select_list_item(i).expr().expr_func().expr_func_params().func_param().get(j).getText());
                        }
                    }
                    arr_fun_list.add(new Pair<>(select_list.select_list_item(i).expr().expr_func().ident().getText(),parameter));
                }
                else {
                    System.out.print("error in the line "+select_list.getStart().getLine() + " : ");
                    System.out.println(select_list.select_list_item(i).getText() + " syntax error");
                }
            }
        }
        compilerParser.Subselect_stmtContext subselect_stmt= (compilerParser.Subselect_stmtContext) a;
        if(subselect_stmt.group_by_clause()!=null){
            for(int i=0;i<subselect_stmt.group_by_clause().expr().size();i++){
                arr_group_list.add(subselect_stmt.group_by_clause().expr(i).getText());
            }
        }
        From_Clause from_clause =new From_Clause();
        from_clause.setTable_name(subselect_stmt.from_clause().from_table_clause().getText());
        arr_from_list.add(subselect_stmt.from_clause().from_table_clause().getText());
        if(subselect_stmt.from_clause().from_join_clause()!=null){
            for(int i=0;i<subselect_stmt.from_clause().getChildCount()-2;i++){
                From_Join from_join = new From_Join();
                from_join.setTable_name(subselect_stmt.from_clause().from_join_clause(i).from_table_clause().getText());
                from_join.setJoin_type(subselect_stmt.from_clause().from_join_clause(i).getChild(0).getText());
                if(from_join.getJoin_type()!=",")
                    from_join.setBool_expr(set_Bool_Expr(subselect_stmt.from_clause().from_join_clause(i).bool_expr()));
                from_clause.add_From_join(from_join);
                arr_from_list.add(subselect_stmt.from_clause().from_join_clause(i).from_table_clause().getText());
            }
        }
        ////// check if the from list is exist already
        for(int i=0;i<arr_from_list.size();i++){
            if(test.lookup(arr_from_list.get(i))==null){
                System.out.print("error in the line "+select_list.getStart().getLine() + " : ");
                System.out.println("The table "+arr_from_list.get(i)+" is not exist already");
            }
        }
        ////// check if the select list is exist in tables
        boolean check ;
        for (int i = 0; i < arr_select_list.size(); i++) {
            check = false;
            for (int j = 0; j < arr_from_list.size(); j++) {
                if (test.lookup_column(arr_from_list.get(j), arr_select_list.get(i))) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.print("error in the line "+select_list.getStart().getLine() + " : ");
                System.out.println("The column " + arr_select_list.get(i) + " is not exist in the tables ");
            }
        }
        ////// check if the group list is exist in tables
        for(int i=0;i<arr_group_list.size();i++){
            check=false;
            for(int j=0;j<arr_from_list.size();j++){
                if(test.lookup_column(arr_from_list.get(j),arr_group_list.get(i))){
                    check = true;
                    break;
                }
            }
            if (!check){
                System.out.print("error in the line "+select_list.getStart().getLine() + " : ");
                System.out.println("The column " + arr_group_list.get(i) + " is not exist in the tables ");
            }
        }

        boolean ok=false;
        if(((compilerParser.Subselect_stmtContext) a).group_by_clause()!=null){
            for(int i = 0; i<((compilerParser.Subselect_stmtContext) a).select_list().select_list_item().size(); i++){
                if(((compilerParser.Subselect_stmtContext) a).select_list().select_list_item(i).expr()!=null)
                    if(((compilerParser.Subselect_stmtContext) a).select_list().select_list_item(i).expr().expr_agg_window_func()!=null)
                    {
                        ok=true;
                        break;
                    }
            }

            if(!ok){
                System.out.print("error in the line "+select_list.getStart().getLine() + " : ");
                System.out.println("Group by clause is exist and select list don't contain aggregate function");
            }
            for(int i=0;i<((compilerParser.Subselect_stmtContext) a).group_by_clause().expr().size();i++){
                if(((compilerParser.Subselect_stmtContext) a).group_by_clause().expr(i).expr_agg_window_func()!=null){
                    System.out.print("error in the line "+select_list.getStart().getLine() + " : ");
                    System.out.println("Group by clause contain aggregate function");
                    break;
                }
            }

            if(((compilerParser.Subselect_stmtContext) a).group_by_clause().expr().size()!=arr_select_list.size()){
                System.out.print("error in the line "+select_list.getStart().getLine() + " : ");
                System.out.println("Everything in select statement should be in grouping");
            }
            else{
                check=false;
                for (int i=0;i<arr_select_list.size();i++){
                    for(int j=0;j<arr_select_list.size();j++){
                        if(arr_select_list.get(i).equals(((compilerParser.Subselect_stmtContext) a).group_by_clause().expr(j).getText())){
                            check=true;
                            break;
                        }
                    }
                    if(!check) {
                        System.out.print("error in the line "+select_list.getStart().getLine() + " : ");
                        System.out.println(arr_select_list.get(i)+" is not exist in group by clause");
                    }
                }
            }

            if(((compilerParser.Subselect_stmtContext) a).having_clause()!=null){
                compilerParser.Bool_exprContext ttt = ((compilerParser.Subselect_stmtContext) a).having_clause().bool_expr();
                while(ttt.getChild(0).getText().equalsIgnoreCase("not")||ttt.getChild(0).getText().equalsIgnoreCase("(")){
                    ttt=ttt.bool_expr(0);
                }
                if(!check_bool_expr(ttt)){
                    System.out.print("error in the line "+select_list.getStart().getLine() + " : ");
                    System.out.println("Having clause don't contains only grouping functions.");
                }
            }
        }
        else if(((compilerParser.Subselect_stmtContext) a).having_clause()!=null){
            System.out.print("error in the line "+select_list.getStart().getLine() + " : ");
            System.out.println("Syntax error:having exist and group by isn't exist");
        }
        compilerParser.Bool_exprContext bool_expr_gr=null;
        Bool_Expr bool_expr = null;
        if(((compilerParser.Subselect_stmtContext) a).where_clause()!=null) {
            bool_expr_gr = ((compilerParser.Subselect_stmtContext) a).where_clause().bool_expr();
            if (((compilerParser.Subselect_stmtContext) a).where_clause().bool_expr() != null)
                bool_expr = set_Bool_Expr(bool_expr_gr);
        }
        Order order = null;
        if(((compilerParser.Subselect_stmtContext) a).order_by_clause()!=null){
            order = new Order();
            if(((compilerParser.Subselect_stmtContext) a).order_by_clause().T_ASC()!=null){
                order.setAsc(true);
            }
            for (int i=0;i<((compilerParser.Subselect_stmtContext) a).order_by_clause().expr().size();i++) {
                arr_Order_list.add(set_Expr(((compilerParser.Subselect_stmtContext) a).order_by_clause().expr(i)));
            }
            order.setExprs(arr_Order_list);
        }
        for (int i=0;i<arr_fun_list.size();i++){
            arr_select_list.addAll(test.get_fun_Record(arr_fun_list.get(i).getKey()));
        }
        SelectStructure selectStructure = new SelectStructure();
        selectStructure.setArr_table_list(arr_from_list);
        selectStructure.setArr_select_list(arr_select_list);
        selectStructure.setArr_agg_list(arr_agg_list);
        selectStructure.setArr_fun_list(arr_fun_list);
        selectStructure.setArr_group_list(arr_group_list);
        selectStructure.setFrom_clause(from_clause);
        selectStructure.setDELIMITER(',');
        selectStructure.setBool_expr(bool_expr);
        selectStructure.setOrder(order);
        selectStructure.setDistinct(select_list.select_list_set()!=null);
        mp.map_reduce(selectStructure);
    }
    private Bool_Expr set_Bool_Expr(compilerParser.Bool_exprContext bool_expr_gr){
        Bool_Expr bool_expr = new Bool_Expr();
        if(bool_expr_gr.T_OPEN_P()!=null) {
            if(bool_expr_gr.T_NOT()!=null) {
                bool_expr.setNot_exist(true);
            }
            bool_expr.setBool_expr1(set_Bool_Expr(bool_expr_gr.bool_expr(0)));
            return bool_expr;
        }
        if(bool_expr_gr.bool_expr_logical_operator()!=null){
            bool_expr.setLogical_operator(bool_expr_gr.bool_expr_logical_operator().getText());
            bool_expr.setBool_expr1(set_Bool_Expr(bool_expr_gr.bool_expr(0)));
            bool_expr.setBool_expr2(set_Bool_Expr(bool_expr_gr.bool_expr(1)));
        }
        if(bool_expr_gr.bool_expr_atom()!=null){
            Bool_Expr_Atom bool_expr_atom=new Bool_Expr_Atom();
            if(bool_expr_gr.bool_expr_atom().bool_expr_unary()!=null){
                Bool_Expr_Unary bool_expr_unary = new Bool_Expr_Unary();

                if(bool_expr_gr.bool_expr_atom().bool_expr_unary().T_IS()!=null){
                    if(bool_expr_gr.bool_expr_atom().bool_expr_unary().T_NOT()!=null)
                        bool_expr_unary.setNot_exist(true);
                    bool_expr_unary.setIs_exist(true);
                    bool_expr_unary.setExpr1(set_Expr(bool_expr_gr.bool_expr_atom().bool_expr_unary().expr(0)));
                }
                else if(bool_expr_gr.bool_expr_atom().bool_expr_unary().T_BETWEEN()!=null){
                    bool_expr_unary.setExpr1(set_Expr(bool_expr_gr.bool_expr_atom().bool_expr_unary().expr(0)));
                    bool_expr_unary.setExpr2(set_Expr(bool_expr_gr.bool_expr_atom().bool_expr_unary().expr(1)));
                    bool_expr_unary.setExpr3(set_Expr(bool_expr_gr.bool_expr_atom().bool_expr_unary().expr(2)));
                    bool_expr_unary.setBetween_exist(true);
                }
                else if(bool_expr_gr.bool_expr_atom().bool_expr_unary().T_EXISTS()!=null){
                    bool_expr_unary.setIs_exist(true);
                    bool_expr_unary.setSelect_stmt(bool_expr_gr.bool_expr_atom().bool_expr_unary().select_stmt().getText());
                }
                else if(bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_single_in()!=null){
                    Bool_Expr_Single_in bool_expr_single_in=new Bool_Expr_Single_in();
                    if(bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_single_in().T_NOT()!=null){
                        bool_expr_single_in.setNot_exist(true);
                    }
                    if(bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_single_in().select_stmt()!=null){
                        bool_expr_single_in.setSelect_stmt(bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_single_in().select_stmt().getText());
                    }
                    for(int i=0;i<bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_single_in().expr().size();i++){
                        bool_expr_single_in.add_Expr(set_Expr(bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_single_in().expr(i)));
                    }
                    bool_expr_unary.setBool_expr_single_in(bool_expr_single_in);
                }
                else if(bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_multi_in()!=null){
                    Bool_Expr_Multi_in bool_expr_multi_in=new Bool_Expr_Multi_in();
                    if(bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_multi_in().T_NOT()!=null){
                        bool_expr_multi_in.setNot_exist(true);
                    }
                    if(bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_multi_in().select_stmt()!=null){
                        bool_expr_multi_in.setSelect_stmt(bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_multi_in().select_stmt().getText());
                    }
                    for(int i=0;i<bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_multi_in().expr().size();i++){
                        bool_expr_multi_in.add_Expr(set_Expr(bool_expr_gr.bool_expr_atom().bool_expr_unary().bool_expr_multi_in().expr(i)));
                    }
                    bool_expr_unary.setBool_expr_multi_in(bool_expr_multi_in);
                }
                bool_expr_atom.setBool_expr_unary(bool_expr_unary);
            }
            else if(bool_expr_gr.bool_expr_atom().bool_expr_binary()!=null){
                Bool_Expr_Binary bool_expr_binary=new Bool_Expr_Binary();
                bool_expr_binary.setBool_expr_binary_operator(bool_expr_gr.bool_expr_atom().bool_expr_binary().bool_expr_binary_operator().getText());
                bool_expr_binary.setExpr1(set_Expr(bool_expr_gr.bool_expr_atom().bool_expr_binary().expr(0)));
                bool_expr_binary.setExpr2(set_Expr(bool_expr_gr.bool_expr_atom().bool_expr_binary().expr(1)));
                bool_expr_atom.setBool_expr_binary(bool_expr_binary);
            }
            else if(bool_expr_gr.bool_expr_atom().expr()!=null){
                bool_expr_atom.setExpr(set_Expr(bool_expr_gr.bool_expr_atom().expr()));
            }
            bool_expr.setBool_expr_atom(bool_expr_atom);
        }
        return bool_expr;
    }
    private Expr set_Expr(compilerParser.ExprContext expr_gr){
        Expr expr = new Expr();

        if(expr_gr.T_OPEN_P()!=null)return set_Expr(expr_gr.expr(0));
        if(expr_gr.expr_atom()!=null){
            if(expr_gr.expr_atom().date_literal()!=null)expr.setType_expr_atom("date");
            if(expr_gr.expr_atom().bool_literal()!=null)expr.setType_expr_atom("bool");
            if(expr_gr.expr_atom().dec_number()!=null)expr.setType_expr_atom("double");
            if(expr_gr.expr_atom().ident()!=null)expr.setType_expr_atom("ident");
            if(expr_gr.expr_atom().int_number()!=null)expr.setType_expr_atom("int");
            if(expr_gr.expr_atom().string()!=null)expr.setType_expr_atom("String");
            expr.setExpr_atom(expr_gr.expr_atom().getText());
            return expr;
        }
        if(expr_gr.expr()!=null){
            expr.setExpr1(set_Expr(expr_gr.expr(0)));
            expr.setExpr2(set_Expr(expr_gr.expr(1)));
            expr.setOperation(expr_gr.getChild(1).getText());
            return expr;
        }
        return expr;
    }
    private boolean check_bool_expr(compilerParser.Bool_exprContext a){
        int cnt=a.bool_expr().size();
        if(cnt==0){
            if(a.bool_expr_atom()!=null){
                if(a.bool_expr_atom().expr()!=null&&a.bool_expr_atom().expr().expr_agg_window_func()==null){
                    if(a.bool_expr_atom().expr().expr_agg_window_func()==null)return false;
                    return true;
                }
                if(a.bool_expr_atom().bool_expr_unary()!=null){
                    for(int i=0;i<a.bool_expr_atom().bool_expr_unary().expr().size();i++){
                        if(a.bool_expr_atom().bool_expr_unary().expr(i).expr_agg_window_func()!=null)return true;
                    }
                    if(a.bool_expr_atom().bool_expr_unary().bool_expr_single_in()!=null){
                        for(int i=0;i<a.bool_expr_atom().bool_expr_unary().bool_expr_single_in().expr().size();i++){
                            if(a.bool_expr_atom().bool_expr_unary().bool_expr_single_in().expr(i).expr_agg_window_func()!=null)return true;
                        }
                        return false;
                    }
                    if(a.bool_expr_atom().bool_expr_unary().bool_expr_multi_in()!=null){
                        for(int i=0;i<a.bool_expr_atom().bool_expr_unary().bool_expr_multi_in().expr().size();i++){
                            if(a.bool_expr_atom().bool_expr_unary().bool_expr_multi_in().expr(i).expr_agg_window_func()!=null)return true;
                        }
                        return false;
                    }
                    return false;
                }
                if(a.bool_expr_atom().bool_expr_binary()!=null){
                    for(int i=0;i<a.bool_expr_atom().bool_expr_binary().expr().size();i++){
                        if(a.bool_expr_atom().bool_expr_binary().expr(i).expr_agg_window_func()!=null)return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        for(int i=0;i<cnt;i++){
            if(check_bool_expr(a.bool_expr(i)))return true;
        }
        return false;
    }

    @Override public Object visitExpr_func(compilerParser.Expr_funcContext ctx) {
        MethodRecord temp=(MethodRecord) test.getMethod(ctx.ident().getText());
        if(temp==null) {
            System.out.print("error in the line "+ctx.getStart().getLine() + " : ");
            System.out.println(ctx.ident().getText() + " undeclared method");
            return visitChildren(ctx);
        }
        int count=0;
        if(ctx.expr_func_params()!=null)
        count=ctx.expr_func_params().func_param().size();
        if(temp.numberOfParameters()!=count) {
            System.out.print("error in the line "+ctx.getStart().getLine() + " : ");
            System.out.println(ctx.ident().getText()+" don't have required parameters number");
        }
        return visitChildren(ctx);
    }

    // //
    // //
    // //
    // //
    // //
    // //
    // //
    // //
    // //
    // //
    // //

    @Override public Object visitFuncpp(compilerParser.FuncppContext ctx) {
        MethodRecord temp=new MethodRecord(ctx.L_IDENTCPP().getText(),ctx.type().getText());
        for(int i=0;i<ctx.paramcpp().size();i++){
            Record t=new Record(ctx.paramcpp(i).L_IDENTCPP().getText(),ctx.paramcpp(i).type().getText());
            if(!test.ch_type(t.getType())) {
                System.out.print("error in the line "+ctx.getStart().getLine() + " : ");
                System.out.println(t.getType()+" undeclared type");
                break;
            }
            if(ctx.paramcpp(i).T_EQUAL()!=null)t.setValue(ctx.paramcpp(i).numbercpp().getText());
            temp.addParameter(t);
        }
        if(test.getContainingClass().Check_Method(ctx.L_IDENTCPP().getText())) {
            System.out.print("error in the line "+ctx.getStart().getLine() + " : ");
            System.out.println("The Method "+ctx.L_IDENTCPP().getText()+" is exist already");
            return visitChildren(ctx);
        }
        test.getContainingClass().addMethod (ctx.L_IDENTCPP().getText(),temp);
        test.setCurrentScopeNameAndType(ctx.L_IDENTCPP().getText(),ctx.type().getText());
        return visitChildren(ctx);
    }
    @Override public Object visitBodycpp(compilerParser.BodycppContext ctx) {
        test.enterScope();
        if(ctx.parent.getText().compareToIgnoreCase("bodycpp")!=0)
            test.setCurrentScopeNameAndType(test.get_Name_parent(), test.get_type_parent());
        else
            test.setCurrentScopeNameAndType("", test.get_type_parent());
        return visitChildren(ctx);
    }

    @Override public Object visitAssign_with_type(compilerParser.Assign_with_typeContext ctx) {
        test.put(ctx.L_IDENTCPP().getText(),new Record(ctx.L_IDENTCPP().getText(),ctx.type().getText()));
        return visitChildren(ctx);
    }

    @Override public Object visitAssign_without_type(compilerParser.Assign_without_typeContext ctx) {
        if(test.lookup(ctx.L_IDENTCPP().getText())==null){
            System.out.print("error in the line "+ctx.getStart().getLine() + " : ");
            System.out.println("The Variable " + ctx.L_IDENTCPP().getText() + " is not exist already");
        }
        return visitChildren(ctx);
    }

    @Override public Object visitAssign_select(compilerParser.Assign_selectContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitAssign_query_select(compilerParser.Assign_query_selectContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitStmt_if_cpp(compilerParser.Stmt_if_cppContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitStmt_for_cpp(compilerParser.Stmt_for_cppContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitEnd_funcpp(compilerParser.End_funcppContext ctx) {
        if(!test.isReturn()){
            System.out.print("error in the line "+ctx.getStart().getLine() + " : ");
            System.out.println("The Function " + test.getCurrentScopeName() + " not return");
        }
        test.exitScope();
        return visitChildren(ctx);
    }

    @Override public Object visitReturncpp(compilerParser.ReturncppContext ctx) {
        if(ctx.exprcpp()==null){
            if(test.getCurrentScopeType().compareToIgnoreCase("void") != 0){
                System.out.print("error in the line "+ctx.getStart().getLine() + " : ");
                System.out.println("The Function return "+test.getCurrentScopeType()+" and return statement return no thing");
            }
            else test.setReturn(true);
        }
        else if(test.lookup(ctx.exprcpp().exprcppt().identexprcpp().L_IDENTCPP().getText())!=null) {
            if(test.getCurrentScopeType().compareToIgnoreCase(test.lookup(ctx.exprcpp().exprcppt().identexprcpp().L_IDENTCPP().getText()).getType()) != 0){
                System.out.print("error in the line "+ctx.getStart().getLine() + " : ");
                System.out.println("The Function return " + test.getCurrentScopeType() + " and return statement return " + ctx.exprcpp().exprcppt().identexprcpp().L_IDENTCPP().getText());
            }
            else test.setReturn(true);
        }
        return visitChildren(ctx);
    }

    @Override public Object visitIdentexprcpp(compilerParser.IdentexprcppContext ctx) {
        if(ctx.L_IDENTCPP()!=null){
            if(test.lookup(ctx.L_IDENTCPP().getText()) == null){
                System.out.print("error in the line "+ctx.getStart().getLine() + " : ");
                System.out.println("The Variable " + ctx.L_IDENTCPP().getText() + " is not exist already");
            }
            else if(!test.lookup(ctx.L_IDENTCPP().getText()).isassigned()){
                System.out.print("warning in the line "+ctx.getStart().getLine() + " : ");
                System.out.println("The Variable " + ctx.L_IDENTCPP().getText() + " is not assigned already");
            }
        }
        return visitChildren(ctx);
    }

    @Override public Object visitEnd_assign(compilerParser.End_assignContext ctx) {
        ParserRuleContext a = (compilerParser.AssignContext) ctx.getParent();
        if (((compilerParser.AssignContext) a).assign_select() != null){
            if (test.lookup(((compilerParser.AssignContext) a).assign_select().L_IDENTCPP().getText())==null){
                test.put(((compilerParser.AssignContext) a).assign_select().L_IDENTCPP().getText(),new Record(((compilerParser.AssignContext) a).assign_select().L_IDENTCPP().getText(),"select"));
            }
            test.lookup(((compilerParser.AssignContext) a).assign_select().L_IDENTCPP().getText()).setValue_Select(mp.get_Final_Result());
            System.out.println();
            System.out.println("The Value of Variable Select    :");
            System.out.println(test.lookup(((compilerParser.AssignContext) a).assign_select().L_IDENTCPP().getText()).getValue_Select());
        }
        else if(((compilerParser.AssignContext) a).assign_query_select() != null){
            if (test.lookup(((compilerParser.AssignContext) a).assign_query_select().L_IDENTCPP().getText())==null){
                test.put(((compilerParser.AssignContext) a).assign_query_select().L_IDENTCPP().getText(),new Record(((compilerParser.AssignContext) a).assign_query_select().L_IDENTCPP().getText(),"select"));
            }
            test.lookup(((compilerParser.AssignContext) a).assign_query_select().L_IDENTCPP().getText()).setSelectStructure(mp.getSelectStructure());
            System.out.println();
            System.out.println("The Value of Variable Select query   :");
            System.out.println(test.lookup(((compilerParser.AssignContext) a).assign_query_select().L_IDENTCPP().getText()).getSelectStructure());
        }
        return visitChildren(ctx);
    }

    // //
    // //
    // //
    // //
    // //
    // //
    // //

    @Override public Object visitCreate_table_columns_error(compilerParser.Create_table_columns_errorContext ctx) {
        System.out.println("error in the line "+ctx.getStart().getLine());
        return visitChildren(ctx);
    }
    @Override public Object visitDtype_len_error(compilerParser.Dtype_len_errorContext ctx) {
        System.out.println("error in the line "+ctx.getStart().getLine());
        return visitChildren(ctx);
    }
    @Override public Object visitFor_range_stmt_error(compilerParser.For_range_stmt_errorContext ctx) {
        System.out.println("error in the line "+ctx.getStart().getLine());
        return visitChildren(ctx);
    }
    @Override public Object visitFullselect_stmt_item_error(compilerParser.Fullselect_stmt_item_errorContext ctx) {
        System.out.println("error");
        return visitChildren(ctx);
    }
    @Override public Object visitSelect_list_asterisk_error(compilerParser.Select_list_asterisk_errorContext ctx) {
        System.out.println("error in the line "+ctx.getStart().getLine());
        return visitChildren(ctx);
    }
    @Override public Object visitExpr_error(compilerParser.Expr_errorContext ctx) {
        System.out.println("error in the line "+ctx.getStart().getLine());
        return visitChildren(ctx);
    }
    @Override public Object visitExpr_atom_error(compilerParser.Expr_atom_errorContext ctx) {
        System.out.println("error in the line "+ctx.getStart().getLine());
        return visitChildren(ctx);
    }
}