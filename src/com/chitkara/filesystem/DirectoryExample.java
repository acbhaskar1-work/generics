package com.chitkara.filesystem;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DirectoryExample {

    public static void main(String[] args) {
        FileReader reader = null;
        try {
            File directory = new File("Reports");
            reader = new FileReader("file.txt");

            if (!directory.exists()) {
                directory.mkdir();
            }
            System.out.println("Directory Ready");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            ;
        }
    }
}
