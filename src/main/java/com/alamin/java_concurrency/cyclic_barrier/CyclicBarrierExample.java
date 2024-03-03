package com.alamin.java_concurrency.cyclic_barrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier cbar = new CyclicBarrier(4, ()->{
            System.out.println("Barrier Reached!");
        });
        System.out.println("Started............");
        new MyThread(cbar, "A");
        new MyThread(cbar, "B");
        new MyThread(cbar, "C");
    }
}
