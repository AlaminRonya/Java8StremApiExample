package com.alamin.interviews.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Object resource = new Object();
        Thread t1 = new Thread(()->{
            synchronized (resource){
                System.out.println("Thread-1 is running.");
                System.out.println("Thread-1 is pausing using wait() call.");
                try {
                    resource.wait();
                } catch (InterruptedException e) {
                    Logger.getLogger(WaitNotifyDemo.class.getName()).log(Level.SEVERE, e.getMessage());
                }
                System.out.println("Thread-1 is resuming after receiving notify() call.");
            }
        });
        Thread t2 = new Thread(()->{
            synchronized (resource){
                System.out.println("Thread-2 is running.");
                try {
                    Thread.sleep(2000);
                    System.out.println("Thread-2: Notifying Thread-1 to wake-up.");
                    resource.notify();
                } catch (InterruptedException e) {
                    Logger.getLogger(WaitNotifyDemo.class.getName()).log(Level.SEVERE, e.getMessage());
                }

                System.out.println("Thread-2 is finished......");
            }
        });
        t1.start();
        t2.start();
    }
}
