package com.alamin.ds_algo.data_structure.array;

import java.util.Arrays;

public class  Array<E> {
    private final Object[] items;   //object array
    public final int length;
    // class constructor
    public Array(int length)    {
        // instantiate a new Object array of specified length
        items = new Object [length];
        this.length = length;
    }
    // get obj_array[i]
    public E get(int i) {
        @SuppressWarnings("unchecked")
        final E e = (E) items[i];
        return e;
    }
    // set e at obj_array[i]
    public void set(int i, E e) {
        items[i] = e;
    }
    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
class Main {
    public static  <T> T[] getArray(int size) {
        T[] genericArray = (T[]) new Object[size];
        return genericArray;
    }
    public static void main(String[] args){
        String a[] = {"a","b"};
        String[] array = getArray(10);
        final int length = 5;
        // creating integer array
        Array<Integer>int_Array = new Array<>(length);
        System.out.print("Generic Array <Integer>:" + " ");
        for (int i = 0; i < length; i++)
            int_Array.set(i, i * 2);
        System.out.println(int_Array);
        // creating string array
        Array<String>str_Array = new Array<>(length);
        System.out.print("Generic Array <String>:" + " ");
        for (int i = 0; i < length; i++)
            str_Array.set(i, String.valueOf((char)(i + 97)));
        System.out.println(str_Array);
    }
}

