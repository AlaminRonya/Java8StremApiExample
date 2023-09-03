package com.alamin.sdlc_pro.thread;

public class ThreadTest_02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(ThreadTest_02::loop);
        Thread t1 = new Thread(ThreadTest_02::loop);
        t0.start();
        t1.start();
        Thread.sleep(1000);
        System.out.println(t0.getState());
    }
    static void loop(){
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " : "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
