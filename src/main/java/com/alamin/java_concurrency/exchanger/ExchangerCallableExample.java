package com.alamin.java_concurrency.exchanger;

import java.util.concurrent.*;

public class ExchangerCallableExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create two callable tasks for data exchange
        Callable<String> callable1 = new DataExchangeCallable(exchanger, "Data from Callable 1");
        Callable<String> callable2 = new DataExchangeCallable(exchanger, "Data from Callable 2");

        // Submit the tasks to the executor
        Future<String> future1 = executor.submit(callable1);
        Future<String> future2 = executor.submit(callable2);

        // Shutdown the executor
        executor.shutdown();

        try {
            // Get the exchanged data from the futures
            String result1 = future1.get();
            String result2 = future2.get();
            System.out.println("Final result from Callable 1: " + result1);
            System.out.println("Final result from Callable 2: " + result2);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}