package Delegate;

import MapReduce.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class OrderBy implements Delegate {
    Scanner scanner = new Scanner();
    List<Integer> indexes = null;
    boolean Asc = true;

    public void setAsc(boolean asc) {
        Asc = asc;
    }

    public void setIndexes(List<Integer> indexes) {
        this.indexes = indexes;
    }

    @Override
    public String execute(BufferedReader br, char Delimiter, String path_shuffler) {
        try { br.close(); } catch (IOException e) { e.printStackTrace(); }
        scanner.setDELIMITER(Delimiter);
        File f = new File(path_shuffler);
        File[] list_of_files = f.listFiles();
        for (int i=0;i<list_of_files.length;i++)
            scanner.sort_file(path_shuffler + "\\" + list_of_files[i].getName(),indexes,Asc);
        return null;
    }
}