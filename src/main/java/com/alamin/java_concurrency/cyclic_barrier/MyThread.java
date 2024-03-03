package com.alamin.java_concurrency.cyclic_barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MyThread {
    CyclicBarrier cbar;
    String name;

    public MyThread(CyclicBarrier cbar, String name) {
        this.cbar = cbar;
        this.name = name;
        new Thread(r).start();
    }
    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println(name);
            try {
                cbar.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
                e.printStackTrace();
            }
        }
    };
}
