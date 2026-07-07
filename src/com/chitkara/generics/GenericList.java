package com.chitkara.generics;

public class GenericList<T> {
    private T[] genericLists = (T[]) new Object[10];
    private int count;

    public void add(T value){
        genericLists[count] = value;
        count++;
    }

    public T get(int index){
        return genericLists[index];
    }


}
