package Delegate;

import MapReduce.Scanner;

import java.io.BufferedReader;
import java.util.List;

public class Sum implements Delegate {

    private Scanner scan = new Scanner();

    @Override
    public String execute(BufferedReader br, char Delimiter, String path_shuffler) {
        scan.setDELIMITER(Delimiter);
        scan.setPath_shuffler(path_shuffler);
        double sum = 0;
        while (true){
            List<String> record ;
            record=scan.Read_Row_CSV_mapper(br);
            if (record==null) {
                return String.valueOf(sum);
            }
            if(record.get(0).compareToIgnoreCase("")!=0)sum+=Double.parseDouble(record.get(0));
        }
    }
}