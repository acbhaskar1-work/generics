package com.chitkara.filesystem;


import java.io.File;

public class DirectoryExample {

    public static void main(String[] args) {

        File directory = new File("Reports");

        if (!directory.exists()) {
            directory.mkdir();
        }

        System.out.println("Directory Ready");
    }
}
