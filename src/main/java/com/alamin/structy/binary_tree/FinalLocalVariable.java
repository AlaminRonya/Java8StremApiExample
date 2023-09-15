package com.alamin.structy.binary_tree;

public class FinalLocalVariable {
    public static void main(String[] args) {
        new FinalLocalVariable().finalParameter(100);
    }
    public  void finalParameter(final int a){
        System.out.println(a);

    }
}
