package com.alamin.thread.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample1 {
    public static void main(String[] args) {
        example1();

    }

    public static void example1(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(newRunnable("Task 1"));
        executorService.execute(newRunnable("Task 2"));
        executorService.execute(newRunnable("Task 3"));
        executorService.execute(newRunnable("Task 4"));
        executorService.shutdown();
    }
    private static Runnable newRunnable(String s) {
        return () -> {
            String completedMsg = Thread.currentThread().getName() +" : "+s;
            System.out.println(completedMsg);
        };
    }
}
