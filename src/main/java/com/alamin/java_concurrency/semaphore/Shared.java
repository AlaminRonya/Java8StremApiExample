package com.alamin.java_concurrency.semaphore;

import java.util.concurrent.atomic.AtomicInteger;

public class Shared {
    private static int count = 0;
    public static void increment(){
        count++;
    }
    public static void decrement(){
        count--;
    }

    public static int getCount() {
        return count;
    }

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
    public static void incrementAtomicInteger(){
        atomicInteger.incrementAndGet();
    }
    public static void decrementAtomicInteger(){
        atomicInteger.decrementAndGet();
    }
}
