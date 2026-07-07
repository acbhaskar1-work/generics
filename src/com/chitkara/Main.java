package com.chitkara;

import com.chitkara.generics.ApiResponse;
import com.chitkara.generics.GenericList;
import com.chitkara.generics.User;


public class Main {
    public static void main(String[] args) {
        var names = new ApiResponse<String>();
        names.response(true,"Invoice");
        System.out.println(names.getData());
    }
}
