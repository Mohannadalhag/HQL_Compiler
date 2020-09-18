package Where_Cluese;

public class Bool_Expr_Binary {
    private Expr expr1 = null;
    private Expr expr2 = null;
    private String bool_expr_binary_operator="";

    public void setExpr1(Expr expr1) {
        this.expr1 = expr1;
    }

    public void setExpr2(Expr expr2) {
        this.expr2 = expr2;
    }

    public void setBool_expr_binary_operator(String bool_expr_binary_operator) {
        this.bool_expr_binary_operator = bool_expr_binary_operator;
    }

    public Expr getExpr2() {
        return expr2;
    }

    public Expr getExpr1() {
        return expr1;
    }

    public String getBool_expr_binary_operator() {
        return bool_expr_binary_operator;
    }
}
