package Where_Cluese;

import java.util.ArrayList;

public class Bool_Expr_Unary {
    private Expr expr1 = null;
    private Expr expr2 = null;
    private Expr expr3 = null;
    private boolean is_exist = false;
    private boolean not_exist = false;
    private boolean between_exist = false;
    private String select_stmt="";
    private Bool_Expr_Single_in bool_expr_single_in = null;
    private Bool_Expr_Multi_in bool_expr_multi_in = null;

    public void setExpr1(Expr expr1) {
        this.expr1 = expr1;
    }

    public void setExpr2(Expr expr2) {
        this.expr2 = expr2;
    }

    public void setExpr3(Expr expr3) {
        this.expr3 = expr3;
    }

    public void setNot_exist(boolean not_exist) {
        this.not_exist = not_exist;
    }

    public void setSelect_stmt(String select_stmt) {
        this.select_stmt = select_stmt;
    }

    public void setBetween_exist(boolean between_exist) {
        this.between_exist = between_exist;
    }

    public void setBool_expr_multi_in(Bool_Expr_Multi_in bool_expr_multi_in) {
        this.bool_expr_multi_in = bool_expr_multi_in;
    }

    public void setIs_exist(boolean is_exist) {
        this.is_exist = is_exist;
    }

    public void setBool_expr_single_in(Bool_Expr_Single_in bool_expr_single_in) {
        this.bool_expr_single_in = bool_expr_single_in;
    }

    public Expr getExpr1() {
        return expr1;
    }

    public Expr getExpr2() {
        return expr2;
    }

    public Expr getExpr3() {
        return expr3;
    }

    public String getSelect_stmt() {
        return select_stmt;
    }

    public Bool_Expr_Multi_in getBool_expr_multi_in() {
        return bool_expr_multi_in;
    }

    public Bool_Expr_Single_in getBool_expr_single_in() {
        return bool_expr_single_in;
    }

    public boolean isNot_exist() {
        return not_exist;
    }

    public boolean isBetween_exist() {
        return between_exist;
    }

    public boolean isIs_exist() {
        return is_exist;
    }
}
