package com.alamin.thread.executor_service;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomImplementationsExecutorService {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 4, 10,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(2),
                new CustomThreadFactor(), new CustomRejectHandler());
//        poolExecutor.allowCoreThreadTimeOut(true);
        for (int i = 0; i < 5; i++) {
            poolExecutor.submit(()->{
                try {
                    Thread.sleep(5000);
                }catch (Exception e){

                }
                System.out.println("Task processed by "+Thread.currentThread().getName());
            });
        }

        poolExecutor.shutdown();

    }
}
