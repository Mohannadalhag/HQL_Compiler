package Where_Cluese;

public class Bool_Expr_Atom {
    private Bool_Expr_Unary bool_expr_unary = null;
    private Bool_Expr_Binary bool_expr_binary = null;
    private Expr expr = null;

    public void setBool_expr_binary(Bool_Expr_Binary bool_expr_binary) {
        this.bool_expr_binary = bool_expr_binary;
    }

    public void setBool_expr_unary(Bool_Expr_Unary bool_expr_unary) {
        this.bool_expr_unary = bool_expr_unary;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Bool_Expr_Binary getBool_expr_binary() {
        return bool_expr_binary;
    }

    public Bool_Expr_Unary getBool_expr_unary() {
        return bool_expr_unary;
    }

    public Expr getExpr() {
        return expr;
    }
}
