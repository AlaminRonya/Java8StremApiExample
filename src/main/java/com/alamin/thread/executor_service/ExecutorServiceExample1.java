package com.alamin.thread.executor_service;

import java.util.concurrent.*;

public class ExecutorServiceExample1 {
    public static void main(String[] args) {
//        example1();
//        example2();
        example4();
        System.out.println("******************");
        example5();

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
        // TODO: 20/12/2023 ThreadPool Implementations
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

    /**
     * Runnable vs Callable
     * Runnable is not return type
     * Callable is return type
     * @param
     * @return
     */
    public static void example4(){
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<?> future = executorService.submit(newRunnable("Task 1.1"));
        System.out.println(future.isDone());
        try {
            future.get();
        }catch (InterruptedException e){

        } catch(ExecutionException e){

        }
        System.out.println(future.isDone());
        executorService.shutdown();
    }
    public static void example5(){
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<?> future = executorService.submit(newCallable("Task 1.1"));
        System.out.println(future.isDone());
        try {
            var msg = (String) future.get();
            System.out.println(msg);
        }catch (InterruptedException | ExecutionException ignored){

        }
        System.out.println(future.isDone());
        executorService.shutdown();
    }
    private static Runnable newRunnable(String s) {
        return () -> {
            String completedMsg = Thread.currentThread().getName() +" : "+s;
            System.out.println(completedMsg);
        };
    }

    private static Callable newCallable(String s) {
        return () -> {
            return Thread.currentThread().getName() +" : "+s;
        };
    }
}
