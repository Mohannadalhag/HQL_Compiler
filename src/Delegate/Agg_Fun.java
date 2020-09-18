package Delegate;


import java.util.List;

public class Agg_Fun {
    public Delegate Call(String function){
        if (function.compareToIgnoreCase("sum")==0){
            return new Sum();
        }
        if (function.compareToIgnoreCase("avg")==0){
            return new Average();
        }
        if (function.compareToIgnoreCase("count")==0){
            return new Count();
        }
        if (function.compareToIgnoreCase("max")==0){
            return new Max();
        }
        if (function.compareToIgnoreCase("min")==0){
            return new Min();
        }
        if(function.compareToIgnoreCase("distinct")==0){
            return new Distinct();
        }
        if(function.compareToIgnoreCase("Order")==0){
            return new OrderBy();
        }
        return null;
    }
    public Delegate Call(String function, List<Integer> indexes, boolean Asc){
        OrderBy orderBy = new OrderBy();
        orderBy.setAsc(Asc);
        orderBy.setIndexes(indexes);
        return orderBy;
    }
}
