package com.alamin.thread.creating_starting_stoping;
// TODO: 4/9/2023 Create of subclass thread

public class Thread2 {
    public static class MyThread extends Thread{
        public void run() {
            System.out.println("Thread is running.....");
            System.out.println("Thread is finished.");
        }
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
