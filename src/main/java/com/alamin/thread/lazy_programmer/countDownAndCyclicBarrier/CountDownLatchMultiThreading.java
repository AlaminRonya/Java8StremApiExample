package com.alamin.thread.lazy_programmer.countDownAndCyclicBarrier;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CountDownLatchMultiThreading {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(5);
        System.out.println(Thread.currentThread().getName()+" : Let's Go For Hiking");
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " : Getting Ready");
                sleep(ThreadLocalRandom.current().nextInt(400, 700));
                System.out.println(Thread.currentThread().getName() + " : Ready");
            }, "Friend-"+i);
            thread.start();

            latch.countDown();
            System.out.println(latch.getCount());
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" : Start Hiking");
        System.out.println(Thread.currentThread().getState());
    }

    private static void sleep(long delay){
        try {
            Thread.sleep(delay);
        }catch (InterruptedException ex){
            Logger.getLogger(CountDownLatchMultiThreading.class.getName()).log(Level.SEVERE, "SLEEP");
        }
    }
}
