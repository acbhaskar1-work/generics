package com.chitkara;

import com.chitkara.generics.List;
import com.chitkara.generics.User;
import com.chitkara.generics.UserList;

public class Main {
    public static void main(String[] args) {
        var userList = new UserList();
        var user = new User();
        userList.add(user);
        System.out.println(userList.get(0));
        var list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(1));
        }
    }
