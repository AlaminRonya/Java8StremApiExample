package com.alamin.sdlc_pro.thread;

// TODO: 05/09/2023 Synchronized
class Counter{
    private static int count = 0;
//    public static void increment(){
//        count++;
//    }
    public static synchronized void increment(){
        count++;
    }

    public static int getCount() {
        return count;
    }
}
public class ThreadTest_07 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    Counter.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    Counter.increment();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Counter.getCount());
    }
}
