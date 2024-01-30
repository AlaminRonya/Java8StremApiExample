package com.alamin.oops;
class A{
    public static void print(){
        System.out.println("A");
    }
}
class B extends A{
    public static void print(){
        System.out.println("B");
    }
}
public class MCQ {
    public static void main(String[] args) {
        A a =  new B();
        a.print();
    }
}
