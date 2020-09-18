package MapReduce;
import Delegate.Agg_Fun;
import Where_Cluese.Bool_Expr;
import Where_Cluese.Bool_Expr_Atom;
import Where_Cluese.Expr;
import javafx.util.Pair;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MapReduce {
    private String local_path = "src\\";
    private Scanner scan = new Scanner();
    private SelectStructure selectStructure ;
    private Mapper mapper=new Mapper();
    private Shuffler shuffler=new Shuffler();
    private Reducer reducer = new Reducer();
    private Merger merger = new Merger();
    private ArrayList<BufferedReader> buffers = null;
    private ArrayList<Integer> br_count = null;
    private List<List<String>> records;
    private List<List<String>> Columns_names;
    private List<List<String>> mapper_Columns_names;
    private List<Boolean> join_Controller;
    private List<Pair<Integer,Integer>> Column_indexes ;
    private List<Pair<Integer,Integer>> Aggregation_indexes ;
    private List<Integer> Rows_Number;
    private List<Integer> Rows_Size;
    private List<Integer> key_index = null;
    private List<Integer> order_index = null;
    private int mapper_number = 0;
    private int size_of_mapper = 5;

    public void map_reduce(SelectStructure selectStructure) {
        this.selectStructure = selectStructure;
        initialize();
        BeforeMapper();
        Shuffler();
        Reducer();
        Close_Buffers();
        Merge();
        print_Execution_plan();
    }
    private void print_Execution_plan(){
        System.out.println();
        for (int i=0;i<selectStructure.getFrom_clause().getFrom_join().size();i++){
            System.out.print("[ ");
        }
        System.out.print(selectStructure.getFrom_clause().getTable_name() + "[ Rows_Number : " + Rows_Number.get(0) + ", Rows_Size : " + Rows_Size.get(0) + " ] ");
        for (int i=0;i<selectStructure.getFrom_clause().getFrom_join().size();i++){
            System.out.print(selectStructure.getFrom_clause().getFrom_join().get(i).getJoin_type()+" ");
            System.out.print(selectStructure.getFrom_clause().getFrom_join().get(i).getTable_name()+ "[ Rows_Number : " + Rows_Number.get(i+1) + ", Rows_Size : " + Rows_Size.get(i+1) + " ] ");
            System.out.print("] ");
        }
        if(selectStructure.getBool_expr()!=null){
            System.out.print("Where ");
        }
        for (int i=0;i<selectStructure.getArr_agg_list().size();i++){
            System.out.print(selectStructure.getArr_agg_list().get(i).getKey()+" "+selectStructure.getArr_agg_list().get(i).getValue().getValue()+" ");
        }
        if(selectStructure.getOrder()!=null)
            System.out.print("Order by " + selectStructure.getOrder().getExprs());
    }
    private void initialize(){
        scan.setDELIMITER(selectStructure.getDELIMITER());
        mapper.setPath_mapper(local_path+"mapper");
        mapper.setDELIMITER(selectStructure.getDELIMITER());
        mapper.setSize_of_mapper(size_of_mapper);
        shuffler.setDELIMITER(selectStructure.getDELIMITER());
        shuffler.setPath_Shuffler(local_path+"shuffler");
        shuffler.setPath_mapper(local_path+"mapper");
        reducer.setDELIMITER(selectStructure.getDELIMITER());
        reducer.setPath_reducer(local_path+"reducer");
        reducer.setPath_Shuffler(local_path+"shuffler");
        reducer.setLocal_path(local_path);
        merger.setLocal_Path(local_path);
        merger.setLocal_Path_Reducer(local_path+"reducer");
        merger.setDelimeter(selectStructure.getDELIMITER());
        br_count = new ArrayList<>();
        buffers = set_bufferreader(0);
        set_Rows();
        set_control_of_join();
        if(buffers == null){
            System.out.println("Buffer Reader is null");
            return;
        }
        Aggregation_indexes = new ArrayList<>();
        records = new ArrayList<>();
        read_Columns_names();
        set_number_of_mapper();
        Column_indexes = new ArrayList<>();
        key_index = new ArrayList<>();
        set_indexes_of_tables();
        mapper_Columns_names = new ArrayList<>();
        if (mapper_number==0){
            mapper_Columns_names.add(mapper.mapper(Columns_names,Column_indexes,0,false));
        }
        for (int i=0;i<mapper_number;i++){
            Column_indexes.add(Aggregation_indexes.get(i));
            mapper_Columns_names.add(mapper.mapper(Columns_names,Column_indexes,i,false));
            Column_indexes.remove(Aggregation_indexes.get(i));
        }
        System.out.println("names_of_Columns");
        System.out.println(Columns_names);
        System.out.println("indexes_of_Column");
        System.out.println(Column_indexes);
        System.out.println("names_of_Columns_mapper ");
        System.out.println(mapper_Columns_names );
        set_order_index();
        set_index_of_key();
        System.out.println("key index");
        System.out.println(key_index);
    }
    private void BeforeMapper(){
        boolean check;
        while (true) {
            check = true;
            System.out.println("records");
            System.out.println(records);
            if(get_index_join()==-1){
                records.clear();
                List<String> record = read_record(0);
                if (record == null)break;
                Rows_Number.set(0,Rows_Number.get(0)+1);
                Rows_Size.set(0,Rows_Size.get(0) + record.size());
                records.add(record);
            }
            else records.add(new ArrayList<>());

            for (int i = 0;i < selectStructure.getFrom_clause().getFrom_join().size(); i++) {
                System.out.println("Check");
                System.out.println(selectStructure.getFrom_clause().getFrom_join().size());
                if(i>=get_index_join()) {
                    check = Control_Join(i);
                    if (!check) break;
                    Rows_Number.set(i+1,Rows_Number.get(i+1)+1);
                    Rows_Size.set(i+1,Rows_Size.get(i+1) + records.get(i+1).size());
                }
                else records.add(new ArrayList<>());
            }
            if (!check) continue;
            if(selectStructure.getBool_expr()!=null)
                check = Proc_Bool_Expr(selectStructure.getBool_expr());
            if (!check) continue;
            System.out.println("before mapper");
            System.out.println(records);
            Mapper();
        }
    }
    private void Mapper(){
        if (mapper_number == 0){
            mapper.mapper(records, Column_indexes, 0);
        }

        for(int i=0;i<mapper_number;i++) {
            Column_indexes.add(Aggregation_indexes.get(i));
            mapper.mapper(records, Column_indexes, i);
            Column_indexes.remove(Aggregation_indexes.get(i));
        }
    }
    private void Shuffler(){
        if (mapper_number == 0){
            if (selectStructure.isDistinct()||selectStructure.getOrder()!=null){
                System.out.println("before shuffler");
                shuffler.shuffler(key_index,0);
            }
        }
        for (int i=0;i<mapper_number;i++){
            System.out.println("before shuffler");
            shuffler.shuffler(key_index,i);
        }
    }
    private void Reducer(){
        Agg_Fun agg_fun = new Agg_Fun();
        if (mapper_number == 0){
            if (selectStructure.isDistinct()){
                reducer.reducer(agg_fun.Call("distinct"), 0, 0);
            }
            if (selectStructure.getOrder()!=null){
                reducer.reducer(agg_fun.Call("Order",order_index,selectStructure.getOrder().isAsc()), 0, 0);
            }
        }
        for(int i=0;i<selectStructure.getArr_agg_list().size();i++){
            if(selectStructure.getArr_agg_list().get(i).getValue().getKey().compareToIgnoreCase("distinct")==0){
                reducer.setPath_reducer(local_path+"temp");
                reducer.reducer(agg_fun.Call(selectStructure.getArr_agg_list().get(i).getValue().getKey()),i,get_index_Shuffler(i));
                reducer.setPath_reducer(local_path+"reducer");
                reducer.setPath_Shuffler(local_path+"temp");
                reducer.reducer(agg_fun.Call(selectStructure.getArr_agg_list().get(i).getKey()), i, i);
                reducer.setPath_Shuffler(local_path+"shuffler");
            }
            else reducer.reducer(agg_fun.Call(selectStructure.getArr_agg_list().get(i).getKey()), i, get_index_Shuffler(i));
            if (selectStructure.getOrder()!=null){
                reducer.setPath_reducer(local_path + "temp_order");
                reducer.setPath_Shuffler(local_path + "reducer");
                reducer.reducer(agg_fun.Call("Order",order_index,selectStructure.getOrder().isAsc()), i, i);
                reducer.setPath_reducer(local_path + "reducer");
                reducer.setPath_Shuffler(local_path + "shuffler");
            }
        }
    }
    private int get_index_Shuffler(int index){
        for (int i=0;i<selectStructure.getArr_agg_list().size();i++){
            if(selectStructure.getArr_agg_list().get(i).getValue().getValue().compareToIgnoreCase(selectStructure.getArr_agg_list().get(index).getValue().getValue())==0)
                return i;
        }
        return 0;
    }
    private void Merge(){
        if (mapper_number > 0) merger.merger(selectStructure.getArr_agg_list().size());
    }
    private void set_Rows(){
        Rows_Number = new ArrayList<>();
        Rows_Size = new ArrayList<>();
        for (int i=0;i<selectStructure.getArr_table_list().size();i++){
            Rows_Number.add(0);
            Rows_Size.add(0);
        }
    }
    private void Close_Buffers(){
        for (int i=0;i<buffers.size();i++){
            try {
                buffers.get(i).close();
            } catch (IOException e) { e.printStackTrace(); }
        }
    }
    private void set_order_index(){
        order_index = new ArrayList<>();
        if(selectStructure.getOrder()!=null){
            for (int i=0;i<selectStructure.getOrder().getExprs().size();i++){
                if (selectStructure.getOrder().getExprs().get(i).getType_expr_atom().compareToIgnoreCase("int")==0){
                    order_index.add(Integer.parseInt(selectStructure.getOrder().getExprs().get(i).getExpr_atom()));
                }
                else if (selectStructure.getOrder().getExprs().get(i).getType_expr_atom().compareToIgnoreCase("ident")==0){
                    String col_name = selectStructure.getOrder().getExprs().get(i).getExpr_atom();
                    for (int j=0;j<mapper_Columns_names.get(0).size();j++) {
                        if (mapper_Columns_names.get(0).get(j).compareToIgnoreCase(col_name)==0) {
                            order_index.add(j);
                            break;
                        }
                    }
                }
            }
        }
    }
    private void set_index_of_key(){
        if (selectStructure.getArr_group_list()!=null) {
            for(int i=0;i<selectStructure.getArr_group_list().size();i++){
                String col_name = selectStructure.getArr_group_list().get(i);
                for (int j=0;j<mapper_Columns_names.get(0).size();j++) {
                    if (mapper_Columns_names.get(0).get(j).compareToIgnoreCase(col_name)==0) {
                        key_index.add(j);
                        break;
                    }
                }
            }
        }
        else if(selectStructure.getOrder()!=null){
            key_index.addAll(order_index);
        }
    }
    private void set_indexes_of_tables() {
        System.out.println("selectStructure.getArr_select_list()");
        System.out.println(selectStructure.getArr_select_list());
        for (int i=0;i<selectStructure.getArr_select_list().size();i++){
            String col_name = selectStructure.getArr_select_list().get(i);
            int index_table = index_table_of_column(col_name);
            if (index_table == -1) continue;
            int index_col = index_of_column(index_table, col_name);
            if (index_col == -1) continue;
            Column_indexes.add(new Pair<>(index_table,index_col));
        }
    }
    private boolean Control_Join(int index){
        if(selectStructure.getFrom_clause().getFrom_join().get(index).getJoin_type().compareToIgnoreCase("innerjoin")==0
            ||selectStructure.getFrom_clause().getFrom_join().get(index).getJoin_type().compareToIgnoreCase("join")==0)
            return Read_inner_join(index);
        if(selectStructure.getFrom_clause().getFrom_join().get(index).getJoin_type().compareToIgnoreCase("leftjoin")==0
            ||selectStructure.getFrom_clause().getFrom_join().get(index).getJoin_type().compareToIgnoreCase("leftouterjoin")==0)
            return Read_Left_join(index);
        if(selectStructure.getFrom_clause().getFrom_join().get(index).getJoin_type().compareToIgnoreCase("Rightjoin")==0
                ||selectStructure.getFrom_clause().getFrom_join().get(index).getJoin_type().compareToIgnoreCase("Rightouterjoin")==0)
            return Read_Right_join(index);
        if(selectStructure.getFrom_clause().getFrom_join().get(index).getJoin_type().compareToIgnoreCase("fulljoin")==0
                ||selectStructure.getFrom_clause().getFrom_join().get(index).getJoin_type().compareToIgnoreCase("fullouterjoin")==0)
            return Read_Full_join(index);
        return false;
    }
    private void read_Columns_names() {
        Columns_names = new ArrayList<>();
        List<String> record;
        for(int i=0;i<buffers.size();i++) {
            record=scan.Read_Row_CSV(buffers.get(i));
            if(record==null) return;
            Columns_names.add(record);
        }
    }
    private boolean Read_inner_join(int index){
        set_buffer(index+1,0);
        read_record(index+1);
        br_count.set(index+1,0);
        List<String> record;
        while (true) {
            record = read_record(index+1);
            if (record == null) return false;
            records.add(record);
            if (Proc_Bool_Expr(selectStructure.from_clause.getFrom_join().get(index).getBool_expr())) {
                return true;
            }
            else records.remove(record);
        }
    }
    private boolean Read_Left_join(int index){
        if(!Read_inner_join(index)) records.add(new ArrayList<>());
        return true;
    }
    private boolean Read_Right_join(int index){
        if(join_Controller.get(index)){
            while (true){
                records.clear();
                List<String> record = read_record(index+1);
                if (record==null){
                    for (int i=0;i<=index;i++){
                        set_buffer(i,0);
                        read_record(i);
                        br_count.set(i,0);
                    }
                    join_Controller.set(index,false);
                    return false;
                }
                for (int i=0;i<=index;i++)records.add(new ArrayList<>());
                records.add(record);
                set_buffer(index,0);
                read_record(index);
                br_count.set(index,0);
                boolean check;
                while (true){
                    check = false;
                    record = read_record(index);
                    if (record == null) {check = true; break;}
                    records.set(index,record);
                    if(Proc_Bool_Expr(selectStructure.from_clause.getFrom_join().get(index).getBool_expr())){
                        break;
                    }
                    else records.set(index,new ArrayList<>());
                }
                if (check) return true;
            }
        }
        else {
            return Read_inner_join(index);
        }
    }
    private boolean Read_Full_join(int index){
        if(join_Controller.get(index)){
            if(!Read_Right_join(index)){buffers = set_bufferreader(0);read_Columns_names();return false;}
            return true;
        }
        else return Read_Left_join(index);
    }
    private void set_control_of_join(){
        join_Controller = new ArrayList<>();
        for (int i=0;i<selectStructure.getFrom_clause().getFrom_join().size();i++)
        {
            if(selectStructure.getFrom_clause().getFrom_join().get(i).getJoin_type().compareToIgnoreCase("rightjoin")==0
                    ||selectStructure.getFrom_clause().getFrom_join().get(i).getJoin_type().compareToIgnoreCase("rightouterjoin")==0
                    ||selectStructure.getFrom_clause().getFrom_join().get(i).getJoin_type().compareToIgnoreCase("fulljoin")==0
                    ||selectStructure.getFrom_clause().getFrom_join().get(i).getJoin_type().compareToIgnoreCase("fullouterjoin")==0)
                join_Controller.add(true);
            else join_Controller.add(false);
        }
    }
    private ArrayList<BufferedReader> set_bufferreader(int count){
        ArrayList<BufferedReader> br = new ArrayList<>();
        for (int i=0;i<selectStructure.getArr_table_list().size();i++){
            BufferedReader temp=set_buffer(i,count);
            if(temp==null)return null;
            br_count.add(0);
            br.add(temp);
        }
        return br;
    }
    private BufferedReader set_buffer(int index,int i){
        String table = selectStructure.getArr_table_list().get(index);
        if(get_file_from_folder(table,i)=="")return null;
        try {
            return new BufferedReader(new FileReader(local_path+table+"\\"+get_file_from_folder(table,i)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    private List<String> read_record(int index){
        List<String> record ;
        record=scan.Read_Row_CSV(buffers.get(index));
        if (record==null) {
            br_count.set(index,br_count.get(index)+1);
            if(set_buffer(index,br_count.get(index))==null)return null;
            buffers.set(index,set_buffer(index,br_count.get(index)));
            record=scan.Read_Row_CSV(buffers.get(index));
        }
        return record;
    }
    private int index_of_table(String table){
        for(int i=0;i<selectStructure.getArr_table_list().size();i++){
            if(selectStructure.getArr_table_list().get(i).compareToIgnoreCase(table)==0)return i;
        }
        return -1;
    }
    private int index_of_column(int index, String col_name){
        for (int i=0;i<Columns_names.get(index).size();i++) {
            if(Columns_names.get(index).get(i).compareToIgnoreCase(col_name)==0) return i;
        }
        return -1;
    }
    private int index_table_of_column(String col_name){
        for(int i=0;i<Columns_names.size();i++){
            if(index_of_column(i,col_name)!=-1)return i;
        }
        return -1;
    }
    private String get_column_after_dot(String ident){
        for(int i=0;i<ident.length();i++){
            if(ident.charAt(i)=='.')
                return ident.substring(i+1);
        }
        return null;
    }
    private String get_table_before_dot(String ident){
        for(int i=0;i<ident.length();i++){
            if(ident.charAt(i)=='.')
                return ident.substring(0,i);
        }
        return null;
    }
    private String get_file_from_folder(String path,int i){
        File Folder = new File(local_path+path);
        File[] list_of_files = Folder.listFiles();
        if(list_of_files==null)return "";
        if(i>=list_of_files.length)return "";
        return list_of_files[i].getName();
    }
    private boolean Proc_Bool_Expr( Bool_Expr bool_expr){
        if(bool_expr.isNot_exist())return !Proc_Bool_Expr(bool_expr.getBool_expr1());
        if(bool_expr.getLogical_operator().compareToIgnoreCase("")!=0){
            if(bool_expr.getLogical_operator().compareToIgnoreCase("and")==0){
                return Proc_Bool_Expr(bool_expr.getBool_expr1())&&Proc_Bool_Expr(bool_expr.getBool_expr2());
            }
            if(bool_expr.getLogical_operator().compareToIgnoreCase("or")==0){
                return Proc_Bool_Expr(bool_expr.getBool_expr1())||Proc_Bool_Expr(bool_expr.getBool_expr2());
            }
        }
        if(bool_expr.getBool_expr_atom()!=null){
            return Bool_expr_atom(bool_expr.getBool_expr_atom());
        }
        return false;
    }
    private boolean Bool_expr_atom (Bool_Expr_Atom bool_expr){
        if(bool_expr.getBool_expr_unary()!=null){
            if(bool_expr.getBool_expr_unary().isIs_exist()){
                if(Value_of_ident(bool_expr.getBool_expr_unary().getExpr1().getExpr_atom()).compareToIgnoreCase("")==0){
                    if(bool_expr.getBool_expr_unary().isNot_exist())return false;
                    else return true;
                }
                else {
                    if(bool_expr.getBool_expr_unary().isNot_exist())return true;
                    else return false;
                }
            }
            if(bool_expr.getBool_expr_unary().isBetween_exist()){
                if(Expr_proc(bool_expr.getBool_expr_unary().getExpr1()).compareToIgnoreCase("")==0
                    ||Expr_proc(bool_expr.getBool_expr_unary().getExpr2()).compareToIgnoreCase("")==0
                    ||Expr_proc(bool_expr.getBool_expr_unary().getExpr3()).compareToIgnoreCase("")==0)return false;
                if(Double.parseDouble(Expr_proc(bool_expr.getBool_expr_unary().getExpr1()))>=Double.parseDouble(Expr_proc(bool_expr.getBool_expr_unary().getExpr2()))){
                    if(Double.parseDouble(Expr_proc(bool_expr.getBool_expr_unary().getExpr1()))<=Double.parseDouble(Expr_proc(bool_expr.getBool_expr_unary().getExpr3()))){
                        return true;
                    }
                }
                return false;
            }
            if (bool_expr.getBool_expr_unary().getBool_expr_single_in()!=null){
                return true;
            }
            if (bool_expr.getBool_expr_unary().getBool_expr_multi_in()!=null){
                return true;
            }
        }
        if(bool_expr.getBool_expr_binary()!=null) {
            Object Value1 = Expr_proc(bool_expr.getBool_expr_binary().getExpr1());
            Object Value2 = Expr_proc(bool_expr.getBool_expr_binary().getExpr2());
            switch (bool_expr.getBool_expr_binary().getBool_expr_binary_operator()) {
                case "==":
                    if(Value1.toString().compareToIgnoreCase(Value2.toString()) == 0)return true;
                    break;
                case "=":
                    if(Value1.toString().compareToIgnoreCase(Value2.toString()) == 0)return true;
                    break;
                case "!=":
                    if(Value1.toString().compareToIgnoreCase(Value2.toString()) != 0)return true;
                    break;
                case "<>":
                    if(Value1.toString().compareToIgnoreCase(Value2.toString()) != 0)return true;
                    break;
                case "<":
                    if(Value1==""||Value2=="")return false;
                    if(Double.parseDouble(Value1.toString()) < Double.parseDouble(Value2.toString())) return true;
                    break;
                case "<=":
                    if(Value1==""||Value2=="")return false;
                    if(Double.parseDouble(Value1.toString()) <= Double.parseDouble(Value2.toString())) return true;
                    break;
                case ">":
                    if(Value1==""||Value2=="")return false;
                    if(Double.parseDouble(Value1.toString()) > Double.parseDouble(Value2.toString())) return true;
                    break;
                case ">=":
                    if(Value1==""||Value2=="")return false;
                    if(Double.parseDouble(Value1.toString()) >= Double.parseDouble(Value2.toString())) return true;
                    break;
                case "like":
                    if(((String) Value1).compareToIgnoreCase(((String) Value2)) == 0)return true;
                    break;
                case "notlike":
                    if(((String) Value1).compareToIgnoreCase(((String) Value2)) != 0)return true;
                    break;
            }
        }
        return false;
    }
    private String Expr_proc(Expr expr){
        if (expr == null)return "";
        if(expr.getExpr_atom()!=null){
            switch (expr.getType_expr_atom()){
                case "date":
                    try {
                        return new SimpleDateFormat("dd/MM/yyyy").parse(expr.getExpr_atom()).toString();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                case "bool":
                    if(expr.getExpr_atom().compareToIgnoreCase("true")==0)return "true";
                    else return "false";
                case "double":return expr.getExpr_atom();
                case "ident":return Value_of_ident(expr.getExpr_atom());
                case "int":return expr.getExpr_atom();
                case "String":return expr.getExpr_atom();
            }
        }
        if(expr.getExpr1()!=null){
            switch (expr.getOperation()){
                case "*": return String.valueOf(Double.parseDouble(Expr_proc(expr.getExpr1()))
                            *Double.parseDouble(Expr_proc(expr.getExpr2())));
                case "/":return String.valueOf(Double.parseDouble(Expr_proc(expr.getExpr1()))
                        /Double.parseDouble(Expr_proc(expr.getExpr2())));
                case "+":return String.valueOf(Double.parseDouble(Expr_proc(expr.getExpr1()))
                        +Double.parseDouble(Expr_proc(expr.getExpr2())));
                case "-":return String.valueOf(Double.parseDouble(Expr_proc(expr.getExpr1()))
                        -Double.parseDouble(Expr_proc(expr.getExpr2())));
            }
        }
        return "";
    }
    private String Value_of_ident(String ident){
        System.out.println("ident");
        System.out.println(ident);
        String table = get_table_before_dot(ident);
        String column = get_column_after_dot(ident);
        System.out.println("teble");
        System.out.println(table);
        int index_table = index_of_table(table);
        int index_column = index_of_column(index_table,column);
        if(index_table<records.size())
            if(index_column<records.get(index_table).size())
        return records.get(index_table).get(index_column);
            else return "";
        else return "";
    }
    private void set_number_of_mapper(){
        for (int i=0;i<selectStructure.getArr_agg_list().size();i++){
            boolean Check = true;
            for (int j = i-1; j>=0; j--){
                if(selectStructure.getArr_agg_list().get(i).getValue().getValue().compareToIgnoreCase(selectStructure.getArr_agg_list().get(j).getValue().getValue())==0){
                    Check = false;
                    break;
                }
            }
            if(Check){
                String col_name = selectStructure.getArr_agg_list().get(i).getValue().getValue();
                int index_table = index_table_of_column(col_name);
                if (index_table == -1) continue;
                int index_col = index_of_column(index_table, col_name);
                if (index_col == -1) continue;
                Aggregation_indexes.add(new Pair<>(index_table,index_col));
                mapper_number++;
            }
        }
    }

    private int get_index_column_mapper(String Column_name,int index_mapper){
        System.out.println("mapper_Columns_names");
        System.out.println(mapper_Columns_names);
        for (int i=0;i<mapper_Columns_names.size();i++)
        {
            if(mapper_Columns_names.get(index_mapper).get(i).compareToIgnoreCase(Column_name)==0)return i;
        }
        return -1;
    }
    private int get_index_join(){
        for(int i=join_Controller.size()-1;i>=0;i--){
            if(join_Controller.get(i))return i;
        }
        return -1;
    }

    public List get_Value(){
        List <List <String>> lists = new ArrayList<>();
        List<String> list ;
        BufferedReader bufferedReader = null;
        try {
            if(mapper_number != 0)
                bufferedReader= new BufferedReader(new FileReader(local_path + "\\Final_result\\0"));
            else return null;
        } catch (FileNotFoundException e) { e.printStackTrace(); }
        while (true){
            list = scan.Read_Row_CSV(bufferedReader);
            if (list == null) return lists;
            lists.add(list);
        }
    }

    public List<List<String>> get_Final_Result(){
        List <List<String>> a = new ArrayList<>();
        BufferedReader br = null;
        if (mapper_number != 0){
            try {
                br = new BufferedReader(new FileReader(local_path + "\\Final_result\\0"));
            } catch (FileNotFoundException e) { e.printStackTrace(); }
            while (true){
                List<String> temp= scan.Read_Row_CSV_mapper(br);
                if (temp == null)return a;
                a.add(temp);
            }
        }
        return a;
    }

    public SelectStructure getSelectStructure() {
        return selectStructure;
    }
}