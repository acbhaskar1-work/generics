package com.chitkara.generics;

import java.util.TreeMap;

public class ApiResponse<T> {

    public TreeMap<Integer, TreeMap<Boolean, T>> items = new TreeMap<>();


    public void response(int index, boolean success, T data){
    TreeMap<Boolean, T> item = new TreeMap<>();
    item.put(success,data);
    items.put(index,item);
    }
    public TreeMap getData(){
        return items;
    }

}
