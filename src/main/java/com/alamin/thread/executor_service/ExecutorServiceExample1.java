package com.alamin.thread.executor_service;

import java.util.concurrent.*;

public class ExecutorServiceExample1 {
    public static void main(String[] args) {
        example1();
        example2();

    }

    public static void example1(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(newRunnable("Task 1"));
        executorService.execute(newRunnable("Task 2"));
        executorService.execute(newRunnable("Task 3"));
        executorService.execute(newRunnable("Task 4"));
        executorService.shutdown();
    }
    public static void example2(){
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(newRunnable("Task 1.1"));
        executorService.execute(newRunnable("Task 1.2"));
        executorService.execute(newRunnable("Task 1.3"));
        executorService.execute(newRunnable("Task 1.4"));
        executorService.shutdown();
    }
    public static void example3(){
        int corePoolSize = 10;
        int maxPoolSize = 20;
        long keepAliveTime = 3000;
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(
                corePoolSize,
                maxPoolSize,
                keepAliveTime,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(128)
        );
        threadPoolExecutor = Executors.newFixedThreadPool(3);
        ExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(corePoolSize);
        scheduledExecutorService = Executors.newFixedThreadPool(10);


    }
    private static Runnable newRunnable(String s) {
        return () -> {
            String completedMsg = Thread.currentThread().getName() +" : "+s;
            System.out.println(completedMsg);
        };
    }
}
