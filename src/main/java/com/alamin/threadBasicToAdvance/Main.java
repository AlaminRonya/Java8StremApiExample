package com.alamin.threadBasicToAdvance;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private volatile static boolean kill;

    public static void main(String[] args) {
        // option 1: Superclass the thread class
//        ThreadSubClassExample threadSubClassExample = new ThreadSubClassExample("ThreadSubClassExample");
//        threadSubClassExample.start();
        // option 2: Implements the Runnable interface
//        RunnableImplementationExample runnableImplementationExample = new RunnableImplementationExample();
//        Thread thread = new Thread(runnableImplementationExample, "RunnableImplementationExample");
//        thread.start();
//        try {
//            threadSubClassExample.join();
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        // option 3: ExecutorService
        // B1: No need to extend the Thread class, no need to instantiate a Thread Object
        final ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.submit(Main::execute);
//        executorService.shutdown();
        // B2: Manages the Thread for you
        kill = true;
//        final Future<?> future = executorService.submit(Main::execute);
//        try {
//            future.get();
//        } catch (InterruptedException | ExecutionException e) {
//            System.out.println();
//            System.out.println(e.getMessage());
//        }
//        executorService.submit(Main::execute);
        // B3: It manages the workload for you
        // B4: The task/work is not "hard-coded"
        executorService.submit(()->{
//            Main::execute;
            try {
                Thread.sleep(1000L);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
            execute();
            System.out.printf("%nTask One");
        });
        executorService.submit(()->{
            try {
                Thread.sleep(1000L);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
            System.out.printf("%nTask Two");
        });
        executorService.submit(()->{
            try {
                Thread.sleep(1000L);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
            System.out.printf("%nTask Three");
        });
        executorService.shutdown();
    }

    public static class ThreadSubClassExample extends Thread{
        public ThreadSubClassExample(String threadName) {
            super(threadName);
        }

        @Override
        public void run() {
            execute();
        }
    }
    public static class RunnableImplementationExample implements Runnable{

        @Override
        public void run() {
            execute();
        }
    }
//    public static void execute(){
//        System.out.printf("%n%s is executing....", Thread.currentThread().getName());
//        for (int i = 0; i < 100; i++) {
//            if (i%2 == 0){
//                System.out.printf("%n%d", i);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        System.out.printf("%n%s is done executing and will die....", Thread.currentThread().getName());
//    }
    public static void execute(){
        System.out.printf("%n%s is executing....", Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0 ){
                System.out.printf("%n%d", i);
                if (i == 8 && kill){
                    throw new RuntimeException("Uh oh!");
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.printf("%n%s is done executing and will die....", Thread.currentThread().getName());
    }
}
