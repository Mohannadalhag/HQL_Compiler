package MapReduce;
import javafx.util.Pair;
import java.util.*;

public class Mapper {
    private char DELIMITER = ' ';
    private int size_of_mapper;
    private Scanner scan = new Scanner();
    private String path_mapper = "";
    private int Local_count=-2;

    public void setPath_mapper(String path_mapper) {
        this.path_mapper = path_mapper;
        scan.setPath_mapper(path_mapper);
    }

    public void setSize_of_mapper(int size_of_mapper) {
        this.size_of_mapper = size_of_mapper;
    }

    public int getSize_of_mapper() {
        return size_of_mapper;
    }

    public void setDELIMITER(char DELIMITER) {
        this.DELIMITER = DELIMITER;
        scan.setDELIMITER(DELIMITER);
    }

    public List mapper(List<List<String>> records, List<Pair<Integer, Integer>> indexes_of_tables, int local_mapper) {
        return mapper(records,indexes_of_tables ,local_mapper ,true );
    }

    public List mapper(List<List<String>> records, List<Pair<Integer, Integer>> indexes_of_tables, int local_mapper, boolean Check) {
        scan.setPath_mapper(path_mapper+local_mapper++);
        List<String> new_record = new ArrayList<>();
        for(int i=0;i<indexes_of_tables.size();i++){
            if(records.get(indexes_of_tables.get(i).getKey()).size()!=0)
                new_record.add(records.get(indexes_of_tables.get(i).getKey()).get(indexes_of_tables.get(i).getValue()));
            else new_record.add("");
        }
        if(Local_count==size_of_mapper-1&&Check){
            Local_count = 0;
            scan.Write_CSV_Mapper(new_record,true);
        }
        else if(Check){
            scan.Write_CSV_Mapper(new_record,false);
            Local_count++;
        }
        return new_record;
    }
}