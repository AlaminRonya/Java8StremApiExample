package com.alamin.thread.lazy_programmer.dead_lock;

public class DeadLockCode {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        var t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Thread-1 : Lock-1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    synchronized (lock2){
                        System.out.println("Thread-1 : Lock-2");
                    }
                }
            }
        });
        var t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("Thread-2 : Lock-2");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    synchronized (lock1){
                        System.out.println("Thread-2 : Lock-1");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
