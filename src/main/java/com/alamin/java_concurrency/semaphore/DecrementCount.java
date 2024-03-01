package com.alamin.java_concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class DecrementCount {
    private String name;
    private Semaphore semaphore;

    public DecrementCount(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        new Thread(runnable).start();
    }
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                System.out.println(name+" is waiting for a permit.");
                semaphore.acquire();
                System.out.println(name+" gets a permit.");
                for (int i = 0; i < 5; i++) {
                    Shared.decrementAtomicInteger();
                    System.out.println(name+"::"+Shared.getAtomicInteger());
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name+" releases the permit");
            semaphore.release();
        }
    };
}
