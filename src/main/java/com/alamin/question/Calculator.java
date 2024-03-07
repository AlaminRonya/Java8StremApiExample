package com.alamin.question;

public class Calculator {
    public int a;
    public int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int sum(){
        return a+b;
    }
    public int subtract(){
        return a-b;
    }
}
