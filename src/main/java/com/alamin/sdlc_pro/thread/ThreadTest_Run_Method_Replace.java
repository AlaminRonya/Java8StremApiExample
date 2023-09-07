package com.alamin.sdlc_pro.thread;

public class ThreadTest_Run_Method_Replace {
    public static void loop(){
        System.out.println("Thread name is "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread thread = new Thread(ThreadTest_Run_Method_Replace::loop);
        thread.start();
        Thread thread1 = new Thread(ThreadTest_Run_Method_Replace::loop);
        thread1.start();
    }
}
