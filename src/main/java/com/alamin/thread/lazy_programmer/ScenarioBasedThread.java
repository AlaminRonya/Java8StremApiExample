package com.alamin.thread.lazy_programmer;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScenarioBasedThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("T1: Setup Started......");
            for (int i = 0; i < 10; i++) {
                sleep(ThreadLocalRandom.current().nextInt(400, 600));
                System.out.println("T1: Setup Progress of "+((i+1)*10)+"%");
            }
            System.out.println("T1: Setup Completed.......!");
        });
        Thread t2 = new Thread(()->{
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T2: Processing Started......");
            for (int i = 0; i < 10; i++) {
                sleep(ThreadLocalRandom.current().nextInt(400, 600));
                System.out.println("T2: Processing Progress of "+((i+1)*10)+"%");
            }
            System.out.println("T2: Processing Completed.......!");
        });
        Thread t3 = new Thread(()->{
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T3: Processing Started......");
            for (int i = 0; i < 10; i++) {
                sleep(ThreadLocalRandom.current().nextInt(400, 600));
                System.out.println("T3: Processing Progress of "+((i+1)*10)+"%");
            }
            System.out.println("T3: Processing Completed.......!");
        });
        t1.start();
        t2.start();
        t3.start();
    }
    private static void sleep(long delay){
        try {
            Thread.sleep(delay);
        }catch (InterruptedException ex){
            Logger.getLogger(ScenarioBasedThread.class.getName()).log(Level.SEVERE, "SLEEP");
        }
    }
}
