package MapReduce;

import javafx.util.Pair;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class Scanner {

    private char DELIMITER = ' ';
    private String path_mapper = "";
    private String path_shuffler = "";
    private String path_reducer = "";

    public void setPath_mapper(String path_mapper) {
        this.path_mapper = path_mapper;
    }

    public void setPath_shuffler(String path_shuffler) {
        this.path_shuffler = path_shuffler;
    }

    public void setPath_reducer(String path_reducer) {
        this.path_reducer = path_reducer;
    }

    public void setDELIMITER(char DELIMITER) {
        this.DELIMITER = DELIMITER;
    }

    public char getDELIMITER() {
        return DELIMITER;
    }

    public List Read_Row_CSV(BufferedReader br) {
        return Read_CSV(br ,1, true );
    }

    public List Read_Row_CSV_mapper(BufferedReader br) {
        return Read_CSV(br ,1, false );
    }

    public List Read_CSV(BufferedReader br,  int Row_Count, boolean Map_Reduce) {
        List<List<String>> records = new ArrayList<>();
        String line = null;
        int i=0;
        while (true) {
            try {
                line = br.readLine();
            } catch (IOException e) { e.printStackTrace(); }
            if(line==null)break;
            String[] values = line.split(String.valueOf(DELIMITER));
            if(Map_Reduce) values = delete_cutation(values);
            records.add(Arrays.asList(values));
            i++;
            if(i==Row_Count)break;
        }
        if(records.size()==0)return null;
        if(Row_Count==1)return records.get(0);
        return records;
    }

    public void Write_CSV_Shuffler(String key, List<String> Value) {
        File file = new File(path_shuffler);
        if (!(file.exists()&&file.isDirectory())){
            file.mkdirs();
        }
        FileWriter csvWriter;
        String path_shuffler_file = path_shuffler + "\\";
        if(key.compareToIgnoreCase("")!=0)path_shuffler_file += key;
        else path_shuffler_file += "Key_not_exist";
        try {
            csvWriter = new FileWriter(path_shuffler_file,true);
            csvWriter.append(String.join(String.valueOf(DELIMITER), Value));
            csvWriter.append("\n");
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) { e.printStackTrace(); }
    }

    public void Write_CSV_Mapper(List<String> Value, boolean Check) {
        Write_CSV_Mapper(Value, Check, "");
    }

    public void Write_CSV_Mapper(List<String> Value, boolean Check, String path) {
        File file ;
        String path_mapper_file;
        if(path.compareToIgnoreCase("")==0){
            file = new File(path_mapper);
            path_mapper_file = path_mapper + "\\";
        }
        else{
            file = new File(path);
            path_mapper_file = path + "\\";
        }
        if (!(file.exists()&&file.isDirectory())){
            file.mkdirs();
        }
        FileWriter csvWriter;
        File[] list_of_files = file.listFiles();
        if(list_of_files.length==0) path_mapper_file += "0";
        else if (Check) path_mapper_file += Integer.parseInt(list_of_files[list_of_files.length-1].getName())+1;
        else path_mapper_file += Integer.parseInt(list_of_files[list_of_files.length-1].getName());
        try {
            csvWriter = new FileWriter(path_mapper_file,true);
            csvWriter.append(String.join(String.valueOf(DELIMITER), Value));
            csvWriter.append("\n");
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) { e.printStackTrace(); }
    }

    public void Write_CSV_Reducer(String Key,String Value){
        File file = new File(path_reducer);
        if (!(file.exists()&&file.isDirectory())){
            file.mkdirs();
        }
        FileWriter csvWriter;
        String path_reducer_file = path_reducer + "\\" + "0";
        try {
            csvWriter = new FileWriter(path_reducer_file,true);
            csvWriter.append(Key);
            csvWriter.append(DELIMITER);
            csvWriter.append(Value);
            csvWriter.append("\n");
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) { e.printStackTrace(); }
    }

    public void swap_folders(String file1,String file2){
        File File1 = new File(file1);
        File File2 = new File(file2);
        if (!(File1.exists()&&File1.isDirectory()&&File2.exists()&&File2.isDirectory())){
            return;
        }
        delete_dir(file1);
        File2.renameTo(new File(file1));
    }
    public void delete_dir(String file1){
        File File1 = new File(file1);
        if (!(File1.exists()&&File1.isDirectory())){
            return;
        }
        File[] list_of_files = File1.listFiles();
        for (int i=0;i<list_of_files.length;i++){
            try {
                Files.delete(list_of_files[i].toPath());
            } catch (IOException e) { e.printStackTrace(); }
        }
        try {
            Files.delete(File1.toPath());
        } catch (IOException e) { e.printStackTrace();}

    }

    /*  public void sort_files(String path_folder, List<Integer> indexes, boolean asc){
        System.out.println("sort_files");
        File file = new File(path_folder);
        if (!(file.exists()&&file.isDirectory())){
            return;
        }
        File[] list_of_files = file.listFiles();
        for (int i=0;i<list_of_files.length;i++){
            sort_file(list_of_files[i].toString(),indexes,asc);
        }
        sort_folder(path_folder, indexes, asc);
    }
*/
  /*  private void sort_folder(String path_folder, List<Integer> indexes, boolean Asc){
        System.out.println("sort_folder");
        File file = new File(path_folder);
        if (!(file.exists()&&file.isDirectory())){
            return;
        }
        File[] list_of_files = file.listFiles();
        List<BufferedReader> br = new ArrayList<>();
        List<List<String>> temp = new ArrayList<>();
        for (int i=0;i<list_of_files.length;i++){
            try {
                br.add(new BufferedReader(new FileReader(list_of_files[i])));
            } catch (FileNotFoundException e) { e.printStackTrace(); }
            temp.add(new ArrayList<>());
        }
        List<String> record;
        for (int i=0;i<br.size();i++){
            record = Read_Row_CSV_mapper(br.get(i));
            if(record!=null)temp.set(i,record);
        }
        int count = 0;
        while (true){
            int index_node = get_min_max_array(temp,indexes,Asc);
            if(index_node == -1)break;
            if(count==size_of_mapper - 1){
                count = 0;
                Write_CSV_Mapper(temp.get(index_node),true,Local_path+"temp");
            }
            else{
                Write_CSV_Mapper(temp.get(index_node),false,Local_path+"temp");
                count++;
            }
            temp.set(index_node, Read_Row_CSV_mapper(br.get(index_node)));
        }
        for (BufferedReader b:br){
            try {
                b.close();
            } catch (IOException e) { e.printStackTrace();}
        }
    }
*/
  /*  private int get_min_max_array(List<List<String>> list, List<Integer> index, boolean Asc){
        int compare_index = -1;
        double compare_value = 10000000000000000000.0;
        if(!Asc){
            compare_value = -1;
        }
        for (int i=0;i<list.size();i++){
            if(list.get(i)!=null&&list.get(i).size()>index)
            if((Double.parseDouble(list.get(i).get(index)) <= compare_value&&Asc)||
               (!Asc&&Double.parseDouble(list.get(i).get(index)) >= compare_value)){
                compare_value = Double.parseDouble(list.get(i).get(index));
                compare_index = i;
            }
        }
        return compare_index;
    }
*/
    public void sort_file(String path_file, List<Integer> indexes, boolean asc){
        System.out.println("sort_file");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path_file));
        } catch (FileNotFoundException e) { e.printStackTrace(); }

        List <Pair<List<Double>, List<String>> > temp_array = new ArrayList<>();
        List<String> record;

        while (true){
            record = Read_Row_CSV_mapper(br);
            if (record == null)break;
            //if(index >= record.size() || record.get(index).compareToIgnoreCase("")==0)
            //    temp_array.add(new Pair<>(0.0,record));
            /*else*/
            List<Double> temp = new ArrayList<>();
            for (int index:indexes){
                temp.add(Double.parseDouble(record.get(index-1)));
            }
            temp_array.add(new Pair<>(temp,record));
        }

        FileWriter csvWriter = null;
        try {
            csvWriter = new FileWriter(path_file);
        } catch (IOException e) { e.printStackTrace(); }

        if (asc)
            temp_array.sort(new Comparator<Pair<List<Double>, List<String>>>() {
                @Override
                public int compare(Pair<List<Double>, List<String>> o1, Pair<List<Double>, List<String>> o2) {
                    for (int i=0;i<o1.getKey().size();i++){
                        if(o1.getKey().get(i) > o2.getKey().get(i))return 1;
                        else if (o1.getKey().get(i) < o2.getKey().get(i)) return -1;
                    }
                    return 0;
                }
            });
        else
            temp_array.sort(new Comparator<Pair<List<Double>, List<String>>>() {
                @Override
                public int compare(Pair<List<Double>, List<String>> o1, Pair<List<Double>, List<String>> o2) {
                    for (int i=0;i<o1.getKey().size();i++){
                        if(o1.getKey().get(i) < o2.getKey().get(i))return 1;
                        else if (o1.getKey().get(i) > o2.getKey().get(i)) return -1;
                    }
                    return 0;
                }
            });
        System.out.println(temp_array);
        for (int i=0;i<temp_array.size();i++){
            try {
                csvWriter.append(String.join(String.valueOf(DELIMITER), temp_array.get(i).getValue()));
                csvWriter.append("\n");
            } catch (IOException e) { e.printStackTrace(); }
        }
        try {
            csvWriter.flush();
            csvWriter.close();
            br.close();
        } catch (IOException e) { e.printStackTrace(); }
    }

    public boolean search(String path_folder, String Value, int index){
        System.out.println("path_folder");
        System.out.println(path_folder);
        File file = new File(path_folder);
        if (!(file.exists()&&file.isDirectory())){
            return false;
        }
        List<String> record;
        File[] list_of_files = file.listFiles();
        BufferedReader br = null;
        System.out.println("list_of_files"+list_of_files.length);
        for (int i=0;i<list_of_files.length;i++){
            System.out.println(list_of_files[i]);
            try {
                br = new BufferedReader(new FileReader(list_of_files[i]));
            } catch (FileNotFoundException e) { e.printStackTrace(); }
            while (true){
                record = Read_Row_CSV_mapper(br);
                if(record == null)break;
                System.out.println(record);
                if(record.size()==0){
                    if(Value.compareToIgnoreCase("")==0){
                        try {
                            br.close();
                        } catch (IOException e) { e.printStackTrace(); }
                        return true;
                    }
                }
                else if (Value.compareToIgnoreCase("") != 0 && record.get(index).compareToIgnoreCase("")!=0){
                    if (Double.parseDouble(record.get(index)) == Double.parseDouble(Value)){
                        try {
                            br.close();
                        } catch (IOException e) { e.printStackTrace(); }
                        return true;
                    }
                }
                else{
                    if (Value.compareToIgnoreCase("") == 0 && record.get(index).compareToIgnoreCase("") == 0){
                        try {
                            br.close();
                        } catch (IOException e) { e.printStackTrace(); }
                        return true;
                    }
                }
            }
            try {
                br.close();
            } catch (IOException e) { e.printStackTrace(); }
        }
        try {
            br.close();
        } catch (IOException e) { e.printStackTrace(); }
        return false;
   }

    private String[] delete_cutation(String[] Values){
        for (int i=0;i<Values.length;i++) {
            Values[i]=Values[i].substring(1,Values[i].length()-1);
        }
        return Values;
    }
    /****
    public void Write_CSV(ArrayList<Pair<String, List<String>>> map,String file_name)  {
        FileWriter csvWriter = null;
        try {
            csvWriter = new FileWriter(file_name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Pair<String, List<String>> rowData : map) {
            try {
                csvWriter.append(rowData.getKey());
                csvWriter.append(DELIMITER);
                csvWriter.append(String.join(String.valueOf(DELIMITER), rowData.getValue()));
                csvWriter.append("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Pair<String, List<String>>> Read_CSV_mapper(String file_name, String DELIMITER){
        ArrayList<Pair<String, List<String>>> map = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file_name))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                map.add(new Pair<>(values[0],Arrays.asList(Arrays.copyOfRange(values,1,values.length))));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
    public static void writeDataLineByLine(String filePath)
    {
        // first create file object for file placed at location
        // specified by filepath
        File file = new File(filePath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // adding header to csv
            String[] header = { "Name", "Class", "Marks" };
            writer.writeNext(header);

            // add data to csv
            String[] data1 = { "Aman", "10", "620" };
            writer.writeNext(data1);
            String[] data2 = { "Suraj", "10", "630" };
            writer.writeNext(data2);

            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void writeDataAtOnce(String filePath)
    {

        // first create file object for file placed at location
        // specified by filepath
        File file = new File(filePath);

        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // create a List which contains String array
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] { "Name", "Class", "Marks" });
            data.add(new String[] { "Aman", "10", "620" });
            data.add(new String[] { "Suraj", "10", "630" });
            writer.writeAll(data);

            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    ****/
}
