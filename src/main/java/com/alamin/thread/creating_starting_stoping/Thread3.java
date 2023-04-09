package com.alamin.thread.creating_starting_stoping;
// TODO: 4/9/2023 Create of implements Runnable interface thread
public class Thread3 {
    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread is running.....");
            System.out.println("Thread is finished.");
        }
    }
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
    }
}
