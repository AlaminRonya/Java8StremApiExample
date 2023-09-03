package com.alamin.sdlc_pro.thread;

// TODO: 03/09/2023 Background is thread
public class ThreadTest_03 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                for (int i = 0; i < 10; i++){
                    System.out.println(thread.getName() + " : "+ thread.isInterrupted() + " : "+i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
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
