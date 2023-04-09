package com.alamin.thread.creating_starting_stoping;

// TODO: 4/9/2023 Create of start multiple thread
public class Thread5 {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" is running");
        };
        Thread thread = new Thread(runnable, "Thread1");
        thread.start();
        Thread thread1 = new Thread(runnable, "Thread2");
        thread1.start();
    }
}
