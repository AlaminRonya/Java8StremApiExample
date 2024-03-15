package com.alamin.java_concurrency.callable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Task implements Callable<String> {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    private final String s;

    public Task(String s) {
        this.s = s;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Current Thread Name: "+Thread.currentThread().getName());
        Thread.sleep(1000);
        int i = atomicInteger.incrementAndGet();
        if (i == 50){
            System.out.println("Exception: "+i);
            int a = 1/0;
        }
        return s+":"+i;
    }
}
