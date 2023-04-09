package com.alamin.thread.creating_starting_stoping;

// TODO: 4/9/2023 Create of pause a thread of specified number of millisecond
public class Thread6 {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" is running...");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(threadName+" finished.");
        };

        Thread thread = new Thread(runnable, "Thread1");
        thread.start();
        Thread thread1 = new Thread(runnable, "Thread2");
        thread1.start();
    }
}
