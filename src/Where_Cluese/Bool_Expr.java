package Where_Cluese;

public class Bool_Expr {
    private boolean not_exist = false;
    private Bool_Expr bool_expr1 = null;
    private Bool_Expr bool_expr2 = null;
    private String logical_operator="";
    private Bool_Expr_Atom bool_expr_atom = null;
    public void setNot_exist(boolean not_is_exist) {
        this.not_exist = not_is_exist;
    }

    public boolean isNot_exist() {
        return not_exist;
    }

    public void setBool_expr1(Bool_Expr bool_expr1) {
        this.bool_expr1 = bool_expr1;
    }

    public void setBool_expr2(Bool_Expr bool_expr2) {
        this.bool_expr2 = bool_expr2;
    }

    public void setBool_expr_atom(Bool_Expr_Atom bool_expr_atom) {
        this.bool_expr_atom = bool_expr_atom;
    }

    public void setLogical_operator(String logical_operator) {
        this.logical_operator = logical_operator;
    }

    public Bool_Expr getBool_expr1() {
        return bool_expr1;
    }

    public Bool_Expr getBool_expr2() {
        return bool_expr2;
    }

    public Bool_Expr_Atom getBool_expr_atom() {
        return bool_expr_atom;
    }

    public String getLogical_operator() {
        return logical_operator;
    }
}
