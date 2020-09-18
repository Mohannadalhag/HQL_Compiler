package from_clause;

import java.util.ArrayList;

public class From_Clause {
    String table_name="";
    ArrayList<From_Join> from_join = new ArrayList<>();

    public void add_From_join(From_Join from_join) {
        this.from_join.add(from_join);
    }

    public void setFrom_join(ArrayList<From_Join> from_join) {
        this.from_join = from_join;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public ArrayList<From_Join> getFrom_join() {
        return from_join;
    }

    public String getTable_name() {
        return table_name;
    }

    @Override
    public String toString() {
        return table_name+from_join;
    }
}
