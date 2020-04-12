package com.company;

import java.io.*;
import java.util.*;

public class FileScanner {
    public static ArrayList<String> getList(String path) {
        ArrayList<String> buffList = new ArrayList<String>();

        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while (line != null) {
                buffList.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffList;
    }
}
