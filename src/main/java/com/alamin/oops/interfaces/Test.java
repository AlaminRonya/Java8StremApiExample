package com.alamin.oops.interfaces;

public class Test implements Test1, Test2 {
    public static void main(String[] args) {
        System.out.println(Test1.value);
        System.out.println(Test2.value);
        new Test().m1();
        new Test().m2();
        new Test().defaultMethodCalling();
        defaultMethodCallingStatic();
    }

//    @Override
//    public void m2() {
//        m1();
//    }
    public void defaultMethodCalling(){
        Test1.super.m2();
    }
    public static void defaultMethodCallingStatic(){
        new Test().m2();
    }

    @Override
    public void m1() {
        System.out.println("inside the m1 method");
    }
}

interface Test1{
    int value = 10; // Interface variables by default(public static): public static int value = 10;
    void m1();
    default void m2(){
        System.out.println("default method implementation!");
    }
}


interface Test2{
    int value = 20;
    void m1();
}
