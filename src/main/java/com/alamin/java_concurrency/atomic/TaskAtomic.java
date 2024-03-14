package com.alamin.java_concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class TaskAtomic implements Runnable{
    private final AtomicInteger atomicInteger;

    public TaskAtomic() {
        this.atomicInteger = new AtomicInteger();
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
           atomicInteger.set(i);
        }
    }
}
