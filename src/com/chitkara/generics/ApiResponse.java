package com.chitkara.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ApiResponse<T> {
    private boolean success;
    private T data;
    private ArrayList<String> items = new ArrayList<>();

    public void response(boolean success, T data){
        this.success = success;
        this.data = data;
    }
    public T getData(){
        return this.data;
    }

}
