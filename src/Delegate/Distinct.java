package Delegate;

import MapReduce.Scanner;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Distinct implements Delegate {

    private Scanner scan = new Scanner();

    @Override
    public String execute(BufferedReader br, char Delimiter, String path_shuffler) {
        scan.setDELIMITER(Delimiter);
        scan.setPath_shuffler(path_shuffler);
        List<String> prevs = new ArrayList<>();
        String result = "";
        while (true){
            List<String> record ;
            record=scan.Read_Row_CSV_mapper(br);
            if (record==null) {
                return result;
            }
            boolean check = true;
            for (String prev : prevs) {
                if (record.get(0).compareToIgnoreCase(prev) == 0) {
                    check = false;
                    break;
                }
            }
            if(check){
                prevs.add(record.get(0));
                if (result.compareToIgnoreCase("") != 0) result += scan.getDELIMITER();
                result += record.get(0);
            }
        }
    }
}
