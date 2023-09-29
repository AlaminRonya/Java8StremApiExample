package com.alamin.sdlc_pro.interfaces;


interface MyInterface1{
    void fun1();
    default void fun(){
        System.out.println("interface::MyInterface1");
    }
}
interface MyInterface2{
    void fun1();
    default void fun(){
        System.out.println("interface::MyInterface2");
    }
}
public class InterfaceAmbiguity implements MyInterface1, MyInterface2 {
    public static void main(String[] args) {
        new InterfaceAmbiguity().fun1();
    }

    @Override
    public void fun1() {
        System.out.println("***************");
    }

    @Override
    public void fun() {
        MyInterface1.super.fun();
        MyInterface2.super.fun();
    }
}
