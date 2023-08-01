package com.alamin.jvm;

public class Call {

     public static void main(String[] args) {
         System.out.println(max(10,20));
    }
     public static int max(int a, int b){
        return a >= b ? a : b;
    }
}
