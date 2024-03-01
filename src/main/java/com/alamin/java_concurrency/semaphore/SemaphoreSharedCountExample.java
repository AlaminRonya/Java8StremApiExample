package com.alamin.java_concurrency.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Concurrent API: Synchronizers Using Semaphore
 */
public class SemaphoreSharedCountExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 10; i++) {
            new IncrementCount("A-"+i, semaphore);
            new DecrementCount("B-"+i, semaphore);
        }

    }
}
