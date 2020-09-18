package from_clause;

import Where_Cluese.Bool_Expr;

public class From_Join {
    String join_type = "";
    String table_name = "";
    Bool_Expr bool_expr = null;

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public void setBool_expr(Bool_Expr bool_expr) {
        this.bool_expr = bool_expr;
    }

    public void setJoin_type(String join_type) {
        this.join_type = join_type;
    }

    public String getTable_name() {
        return table_name;
    }

    public String getJoin_type() {
        return join_type;
    }

    public Bool_Expr getBool_expr() {
        return bool_expr;
    }

    @Override
    public String toString() {
        return join_type+table_name;
    }
}
