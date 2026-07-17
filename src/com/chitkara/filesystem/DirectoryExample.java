package com.chitkara.filesystem;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DirectoryExample {

    public static void main(String[] args) {
        FileReader reader = null;

        try {
            reader = new FileReader("file.txt");
            new SimpleDateFormat().parse("");
            System.out.println("File read successfully");

        } catch (FileNotFoundException | ParseException e) {
            System.out.println("some text two" + e.getMessage());
            throw new RuntimeException(e);
        }
        finally {
            try {
                System.out.println("something");
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }






    }
}
