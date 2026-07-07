package com.chitkara;

import com.chitkara.generics.GenericList;
import com.chitkara.generics.User;

public class Main {
    public static void main(String[] args) {
        var names =new GenericList<String>();
        var numbers =new GenericList<Integer>();
        var students =new GenericList<User>();


        names.add("Bhaskar");
        numbers.add(23);
        students.add(new User());
        System.out.println(names.get(0));
        System.out.println(numbers.get(0));
        System.out.println(students.get(0));

        }
    }
