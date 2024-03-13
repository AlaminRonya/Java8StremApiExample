package com.alamin.java_concurrency.volatile1;

public class VolatileExample {
    public static void main(String[] args) {
        for (int i = 0; i < 200000; i++) {
            new Thread(() -> System.out.println(Thread.currentThread().getName()+"::"+TVSet.getInstance().hashCode())).start();
        }
    }
}
