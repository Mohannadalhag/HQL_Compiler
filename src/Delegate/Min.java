package Delegate;

import MapReduce.Scanner;

import java.io.BufferedReader;
import java.util.List;

public class Min implements Delegate {
    private Scanner scan = new Scanner();

    @Override
    public String execute(BufferedReader br, char Delimiter, String path_shuffler) {
        scan.setDELIMITER(Delimiter);
        scan.setPath_shuffler(path_shuffler);
        double min = 1000000000;
        while (true){
            List<String> record ;
            record=scan.Read_Row_CSV_mapper(br);
            if (record==null) return String.valueOf(min);
            if(record.get(0).compareToIgnoreCase("")!=0){
                if(min > Double.parseDouble(record.get(0)))min =Double.parseDouble(record.get(0));
            }
        }
    }
}
