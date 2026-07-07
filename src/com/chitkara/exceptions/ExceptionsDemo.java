package com.chitkara.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show(){

        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        logExcpetion(null);
    }

    public static void logExcpetion(String message){
        System.out.println(message.toUpperCase());
    }
}
