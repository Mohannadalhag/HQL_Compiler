package MapReduce;

import Where_Cluese.Bool_Expr;
import Where_Cluese.Order;
import from_clause.From_Clause;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class SelectStructure {
    private ArrayList<String> arr_table_list =null;/////array for store table list
    private ArrayList <String> arr_select_list = null;////array for store select list
    private ArrayList<Pair<String, Pair<String, String>>> arr_agg_list = null;//////array for store aggregate function
    private ArrayList <Pair<String, List<String>>> arr_fun_list = null;
    private ArrayList <String> arr_group_list = null;//////array for store group by list
    From_Clause from_clause = null;
    Bool_Expr bool_expr = null;
    Order order = null;
    boolean Distinct = false;
    private char DELIMITER;

    public void setDistinct(boolean distinct) {
        Distinct = distinct;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setBool_expr(Bool_Expr bool_expr) {
        this.bool_expr = bool_expr;
    }

    public void setFrom_clause(From_Clause from_clause) {
        this.from_clause = from_clause;
    }

    public void setArr_table_list(ArrayList<String> arr_table_list) {
        this.arr_table_list = arr_table_list;
    }

    public void setArr_agg_list(ArrayList<Pair<String, Pair<String, String>>> arr_agg_list) {
        this.arr_agg_list = arr_agg_list;
    }

    public void setArr_select_list(ArrayList<String> arr_select_list) {
        this.arr_select_list = arr_select_list;
    }

    public void setArr_fun_list(ArrayList<Pair<String, List<String>>> arr_fun_list) {
        this.arr_fun_list = arr_fun_list;
    }

    public void setArr_group_list(ArrayList<String> arr_group_list) {
        this.arr_group_list = arr_group_list;
    }

    public void setDELIMITER(char DELIMITER) {
        this.DELIMITER = DELIMITER;
    }

    public ArrayList<String> getArr_table_list() {
        return arr_table_list;
    }

    public ArrayList<Pair<String, Pair<String, String>>> getArr_agg_list() {
        return arr_agg_list;
    }

    public ArrayList<String> getArr_select_list() {
        return arr_select_list;
    }

    public ArrayList<Pair<String, List<String>>> getArr_fun_list() {
        return arr_fun_list;
    }

    public ArrayList<String> getArr_group_list() {
        return arr_group_list;
    }

    public From_Clause getFrom_clause() {
        return from_clause;
    }

    public Bool_Expr getBool_expr() {
        return bool_expr;
    }

    public char getDELIMITER() {
        return DELIMITER;
    }

    public boolean isDistinct() {
        return Distinct;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        String Result = "";
        Result += "arr_select_list";
        Result += this.arr_select_list;
        Result += "\n";
        Result += "arr_agg_list";
        Result += this.arr_agg_list;
        Result += "\n";
        Result += "arr_fun_list";
        Result += this.arr_fun_list;
        Result += "\n";
        Result += "arr_table_list";
        Result += this.arr_table_list;
        Result += "\n";
        Result += "from_clause";
        Result += this.from_clause;
        Result += "\n";
        Result += "bool_expr";
        Result += this.bool_expr;
        Result += "\n";
        Result += "arr_group_list";
        Result += this.arr_group_list;
        Result += "\n";
        Result += "DELIMITER";
        Result += this.DELIMITER;
        Result += "\n";
        Result += "Distinct";
        Result += this.Distinct;
        Result += "\n";
        Result += "order";
        Result += this.order;
        Result += "\n";
        return Result;
    }
}
