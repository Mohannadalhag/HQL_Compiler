package Where_Cluese;

public class Expr {
    private Expr expr1 = null;
    private Expr expr2 = null;
    private String operation="";
    private String expr_atom="";
    private String Type_expr_atom="";

    public void setType_expr_atom(String type_expr_atom) {
        Type_expr_atom = type_expr_atom;
    }

    public void setExpr2(Expr expr2) {
        this.expr2 = expr2;
    }

    public void setExpr1(Expr expr1) {
        this.expr1 = expr1;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setExpr_atom(String expr_atom) {
        this.expr_atom = expr_atom;
    }

    public String getOperation() {
        return operation;
    }

    public Expr getExpr1() {
        return expr1;
    }

    public Expr getExpr2() {
        return expr2;
    }

    public String getExpr_atom() {
        return expr_atom;
    }

    public String getType_expr_atom() {
        return Type_expr_atom;
    }
}
