package com.alamin.thread.creating_starting_stoping;

public class Thread8 {
    // TODO: 4/9/2023 Mark a java Thread as a daemon thread
    public static void main(String[] args) {
        Runnable runnable = ()->{
            while (true){
                sleep(1000);
                System.out.println("Running.....");
            }
        };
        Thread thread = new Thread( runnable);
        thread.setDaemon(true);
        thread.start();
        sleep(3100);
    }
    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
