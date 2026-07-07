package com.chitkara;

import com.chitkara.generics.GenericList;
import com.chitkara.generics.User;


public class Main {
    public static void main(String[] args) {
        var names = new GenericList<String>();
        var numbers = new GenericList<Integer>();
        var users = new GenericList<User>();

        names.add("Bhaskar");
        numbers.add(100);
        users.add(new User());
        System.out.println(names.get(0));
        System.out.println(numbers.get(0));
        System.out.println(users.get(0));
    }
}
