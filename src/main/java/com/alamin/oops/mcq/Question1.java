package com.alamin.oops.mcq;
interface C{
    int x = 10;
    void print();
}
class D implements C{
    int x = 20;
    @Override
    public void print() {
        System.out.println("One");
    }
}
public class Question1 {
    public static void main(String[] args) {
        C  c = new D();
        c.print();
        System.out.println(c.x);
    }
}
