package Where_Cluese;

import java.util.ArrayList;

public class Bool_Expr_Multi_in {
    private ArrayList<Expr> exprs=new ArrayList<>();
    private boolean not_exist = false;
    private String select_stmt="";

    public void setExprs(ArrayList<Expr> exprs) {
        this.exprs = exprs;
    }

    public void setNot_exist(boolean not_exist) {
        this.not_exist = not_exist;
    }


    public void add_Expr(Expr expr){
        exprs.add(expr);
    }

    public void setSelect_stmt(String select_stmt) {
        this.select_stmt = select_stmt;
    }

    public ArrayList<Expr> getExprs() {
        return exprs;
    }

    public String getSelect_stmt() {
        return select_stmt;
    }

    public boolean isNot_exist() {
        return not_exist;
    }
}
