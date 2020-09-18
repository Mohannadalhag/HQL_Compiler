package MapReduce;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Merger {
    private String Local_Path_Reducer = "";
    private String Local_Path = "";
    private Scanner scanner = new Scanner();
    public void setLocal_Path_Reducer(String local_Path_Reducer) {
        Local_Path_Reducer = local_Path_Reducer;
    }

    public void setLocal_Path(String local_Path) {
        Local_Path = local_Path;
    }

    public void setDelimeter(char Delimeter) {
        this.scanner.setDELIMITER(Delimeter);
    }

    public void merger(int mapper_number){
        List<BufferedReader> buffers = new ArrayList<>();
        for (int i=0;i<mapper_number;i++){
            try {
                buffers.add(new BufferedReader(new FileReader(Local_Path_Reducer + i +"\\0")));
            } catch (FileNotFoundException e) { e.printStackTrace(); }
        }
        List<String> record = new ArrayList<>();
        List<String> temp;
        List<String> temp1 ;
        while (true){
            temp1 =scanner.Read_Row_CSV_mapper(buffers.get(0));
            if (temp1 == null) {
                for (int i=0;i<buffers.size();i++) {
                    try {
                        buffers.get(i).close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return;
            }
            record.clear();
            record.addAll(temp1);
            for (int i =1;i<mapper_number;i++){
                temp = scanner.Read_Row_CSV_mapper(buffers.get(i));
                record.add(temp.get(1));
            }
            scanner.Write_CSV_Mapper(record,false,Local_Path + "\\Final_result");
        }
    }
}