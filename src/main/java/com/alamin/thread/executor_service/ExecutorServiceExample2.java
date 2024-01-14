package com.alamin.thread.executor_service;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExample2 {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        executorService.shutdown();
//        List<Runnable> runnables = executorService.shutdownNow();
//        try {
//            executorService.awaitTermination(
//                    3000L, TimeUnit.MILLISECONDS
//            );
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future future = executorService.submit(newCallable("Task 1.1"));
        System.out.println(future.isDone());
        boolean mayInterrupt = false;
        boolean wasCancelled = future.cancel(mayInterrupt);
        System.out.println("wasCancelled: "+wasCancelled);

        try {
            String result = (String) future.get();
            System.out.println(result);
        }catch (InterruptedException e){

        } catch (ExecutionException e) {
            e.printStackTrace();
        }catch (CancellationException e){
            String msg = "Cannot call Future.get() since task was cancelled";
            System.out.println(msg);
        }
        System.out.println(future.isDone());
        System.out.println(future.isCancelled());
        executorService.shutdown();

    }
    private static Callable newCallable(String s) {
        return () -> Thread.currentThread().getName() +" : "+s;
    }
}
