package Where_Cluese;

import java.util.List;

public class Order {
    List<Expr> exprs = null;
    boolean Asc = false;

    public void setExprs(List<Expr> exprs) {
        this.exprs = exprs;
    }

    public void setAsc(boolean asc) {
        Asc = asc;
    }

    public boolean isAsc() {
        return Asc;
    }

    public List<Expr> getExprs() {
        return exprs;
    }
}
