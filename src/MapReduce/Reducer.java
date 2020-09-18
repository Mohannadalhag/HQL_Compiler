package MapReduce;

import Delegate.Delegate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reducer {
    private char DELIMITER = ' ';
    private String path_Shuffler = null;
    private String path_reducer = null;
    private Scanner scan = new Scanner();
    private BufferedReader buffer = null;
    private int br_count = 0;
    private String local_path;

    public void setLocal_path(String local_path) {
        this.local_path = local_path;
    }

    public void setPath_reducer(String path_reducer) {
        this.path_reducer = path_reducer;
        scan.setPath_reducer(path_reducer);
    }

    public void setDELIMITER(char DELIMITER) {
        this.DELIMITER = DELIMITER;
        scan.setDELIMITER(DELIMITER);
    }

    public void setPath_Shuffler(String path_Shuffler) {
        this.path_Shuffler = path_Shuffler;
    }

    public void reducer(Delegate call, int index, int id){
        br_count = 0;
        scan.setPath_reducer(path_reducer+index);
        scan.setPath_shuffler(path_Shuffler+id);
        while (true){
            System.out.println("buffer reducer");
            System.out.println(set_buffer(id));
            if (!set_buffer(id))break;
            String Key = get_file_from_folder(id);
            String Value = call.execute(buffer,DELIMITER,path_Shuffler + id );
            br_count++;
            if(this.path_reducer.compareToIgnoreCase(local_path+"reducer")==0) scan.Write_CSV_Reducer(Key, Value);
            else if (this.path_reducer.compareToIgnoreCase(local_path+"temp")==0){
                String[] Values = Value.split(String.valueOf(DELIMITER));
                List<String> list = new ArrayList<>();
                for (String v:Values) list.add(v);
                scan.setPath_shuffler(local_path + "temp" + id);
                scan.Write_CSV_Shuffler(Key,list);
                scan.setPath_shuffler(path_Shuffler+id);
            }
        }
        if(this.path_Shuffler.compareToIgnoreCase(local_path+"temp")==0){
            if (buffer!=null) {
                try { buffer.close(); } catch (IOException e) { e.printStackTrace(); }
            }
            scan.delete_dir(local_path+"temp"+id);
        }

    }

    private boolean set_buffer(int id) {
        if(buffer!=null) {
            try {
                buffer.close();
            } catch (IOException e) { e.printStackTrace(); }
        }
        if (get_file_from_folder(id)=="")return false;
        try {
            buffer = new BufferedReader(new FileReader(path_Shuffler + id + "\\" + get_file_from_folder(id)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (buffer == null)return false;
        else return true;
    }


    private String get_file_from_folder(int id){
        System.out.println(path_Shuffler + id);
        File Folder = new File(path_Shuffler + id);
        File[] list_of_files = Folder.listFiles();
        System.out.println("list_of_files reduce");
        for (int i=0;i<list_of_files.length;i++) System.out.println(list_of_files[i]);
        if(list_of_files==null)return "";
        System.out.println("br_count");
        System.out.println(br_count);
        if(br_count>=list_of_files.length)return "";
        return list_of_files[br_count].getName();
    }

    /*private List<String> read_record(){
        List<String> record ;
        record=scan.Read_Row_CSV_mapper(buffer);
        if (record==null) {
            br_count++;
            if(!set_buffer(id))return null;
            set_buffer(id);
            record=scan.Read_Row_CSV_mapper(buffer);
        }
        return record;
    }*/
}
