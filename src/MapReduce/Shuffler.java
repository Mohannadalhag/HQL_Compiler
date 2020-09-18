package MapReduce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Shuffler {
    private char DELIMITER = ' ';
    private String path_Shuffler = null;
    Scanner scan = new Scanner();
    private BufferedReader buffer = null;
    private int br_count = 0;
    private String path_mapper = "";

    public void setPath_mapper(String path_mapper) {
        this.path_mapper = path_mapper;
    }

    public void setDELIMITER(char DELIMITER) {
        this.DELIMITER = DELIMITER;
        scan.setDELIMITER(DELIMITER);
    }

    public void setPath_Shuffler(String path_Shuffler) {
        this.path_Shuffler = path_Shuffler;
        scan.setPath_shuffler(path_Shuffler);
    }
    public void shuffler(List<Integer> index_of_key, int id_mapper) {
        scan.setPath_shuffler(path_Shuffler+id_mapper);
        scan.setPath_mapper(path_mapper+id_mapper);
        br_count = 0;
        System.out.println("set_buffer");
        System.out.println(set_buffer(id_mapper));
        while (true){
            List<String> record =read_record(id_mapper);
            if (record == null) return;
            String Key = set_Key(record, index_of_key);
            List<String> Value = set_Value(record, index_of_key);
            System.out.println("after shuffler");
            System.out.println(Key);
            System.out.println(Value);
            scan.Write_CSV_Shuffler(Key,Value);
        }
    }
    private String set_Key(List<String> record, List<Integer> index_of_key){
        String Key = "";
        for (int i=0;i<index_of_key.size();i++){
            if(index_of_key.get(i)>=record.size())break;
            if(i%2 != 0)Key += ",";
            Key += record.get(index_of_key.get(i));
        }
        if(Key.compareToIgnoreCase("")==0)return "-1";
        return Key;
    }
    private List set_Value(List<String> record, List<Integer> index_of_key){
        List<String> Value = new ArrayList<>();
        for (int i=0;i<record.size();i++){
            if(!index_of_key.contains(i))Value.add(record.get(i));
        }
        return Value;
    }
    private boolean set_buffer(int id_mapper) {
        if (get_file_from_folder(id_mapper).compareToIgnoreCase("")==0){
            System.out.println("lahrh");return false;}
        try {
            System.out.println("buffer");
            System.out.println(path_mapper+id_mapper+"\\"+get_file_from_folder(id_mapper));
            buffer = new BufferedReader(new FileReader(path_mapper+id_mapper+"\\"+get_file_from_folder(id_mapper)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (buffer == null)return false;
        else return true;
    }


    private String get_file_from_folder(int id_mapper){
        System.out.println("path_mapper+id_mapper");
        System.out.println(path_mapper+id_mapper);
        File Folder = new File(path_mapper+id_mapper);
        File[] list_of_files = Folder.listFiles();
        System.out.println("list_of_files");
        for (int i=0;i<list_of_files.length;i++) System.out.println(list_of_files[i]);
        if(list_of_files==null)return "";
        System.out.println("br_count");
        System.out.println(br_count);
        if(br_count>=list_of_files.length)return "";
        return list_of_files[br_count].getName();
    }

    private List<String> read_record(int id_mapper){
        List<String> record ;
        record=scan.Read_Row_CSV_mapper(buffer);
        if (record==null) {
            br_count++;
            if(!set_buffer(id_mapper))return null;
            set_buffer(id_mapper);
            record=scan.Read_Row_CSV_mapper(buffer);
        }
        return record;
    }
}