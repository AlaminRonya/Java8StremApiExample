package com.alamin.interviews.array;
class A{
    public A( ){
        System.out.println(((PP) this).a);
    }
}
public class PP extends A {
    int a = 80;
    public PP() {
        super();
    }

    public static void main(String[] args) {
        PP p  = new PP();
    }
}
