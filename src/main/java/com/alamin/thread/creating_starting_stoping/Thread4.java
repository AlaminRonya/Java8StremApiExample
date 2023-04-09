package com.alamin.thread.creating_starting_stoping;
// TODO: 4/9/2023 Create of implements Runnable interface with anonymous thread
public class Thread4 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable is running...");
                System.out.println("Runnable is finished");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
