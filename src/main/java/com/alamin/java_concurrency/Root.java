package com.alamin.java_concurrency;

public class Root {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
