package com.alamin.sdlc_pro.thread;

// TODO: 04/09/2023 Background thread vs Daemon thread

/**
 * Parent thread daemon by default child thread daemon
 * Parent thread is closed automatic daemon thread is closed
 */
public class ThreadTest_06 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " is started..........");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is started..........");
                Thread t1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName() + " is started..........");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + " is completed..........");
                    }
                });
                t1.setDaemon(true);
                t1.start();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " is completed..........");
            }
        });
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is completed..........");

    }
}
