package Delegate;

import MapReduce.Scanner;

import java.io.BufferedReader;
import java.util.List;

public class Max implements Delegate {
    private Scanner scan = new Scanner();

    @Override
    public String execute(BufferedReader br, char Delimiter, String path_shuffler) {
        scan.setDELIMITER(Delimiter);
        scan.setPath_shuffler(path_shuffler);
        double max = 0;
        while (true){
            List<String> record ;
            record=scan.Read_Row_CSV_mapper(br);
            if (record==null) return String.valueOf(max);
            if(record.get(0).compareToIgnoreCase("")!=0){
                if(max < Double.parseDouble(record.get(0)))max =Double.parseDouble(record.get(0));
            }
        }
    }
}
