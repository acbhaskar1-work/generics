package com.chitkara;

import com.chitkara.generics.ApiResponse;
import com.chitkara.generics.GenericList;
import com.chitkara.generics.User;

import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {
        var names = new ApiResponse<String>();
        names.response(0,true,"Invoice");
        System.out.println(names.getData());
        TreeMap<Boolean,String> info = new TreeMap<>();
        info.put(true,"Order not processed");
        ApiResponse<TreeMap> custemer = new ApiResponse<>();
        custemer.response(1,false, info);
        System.out.println(custemer.getData());
    }
}
