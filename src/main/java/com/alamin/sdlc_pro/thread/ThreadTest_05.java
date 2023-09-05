package com.alamin.sdlc_pro.thread;

// TODO: 04/09/2023 Background thread vs Daemon thread

/**
 * Parent thread daemon by default child thread daemon
 * Parent thread is closed automatic daemon thread is closed
 */
public class ThreadTest_05 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " is started..........");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                System.out.println(Thread.currentThread().getName() + " is started..........");
                for (int i = 0; i < 10; i++){
                    System.out.println(thread.getName() + " : "+ thread.isInterrupted() + " : "+i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " is completed..........");
            }
        });
        t.setDaemon(true);
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is completed..........");

    }
}
