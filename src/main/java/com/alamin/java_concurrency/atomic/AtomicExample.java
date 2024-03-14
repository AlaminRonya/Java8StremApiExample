package com.alamin.java_concurrency.atomic;

import java.util.Date;

public class AtomicExample {
    public static void main(String[] args) {
        TaskAtomic taskAtomic = new TaskAtomic();
        TaskLock taskLock = new TaskLock();

        int numThreads = 50;
        Thread[] threads = new Thread[numThreads];
        Date begin, end;
        begin = new Date();
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(taskLock);
            threads[i].start();
        }
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        end = new Date();
        System.out.printf("Main: Lock results: %d\n", (end.getTime() - begin.getTime()));
        begin = new Date();
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(taskAtomic);
            threads[i].start();
        }
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        end = new Date();
        System.out.printf("Main: Atomic results: %d\n", (end.getTime() - begin.getTime()));
    }
}
