package com.alamin.java_concurrency.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    private final static int numberOfThread = 10;
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(numberOfThread);
        List<Future<String>> allFuture = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<String> future = service.submit(new Task(i+"::data::"));
            System.out.println(i+"::"+future.isDone());
            System.out.println(i+"::"+future.isDone());
            System.out.println(i+"::"+future.isDone());
            allFuture.add(future);
        }

        for (int i = 0; i < 100; i++) {
            var future = allFuture.get(i);
            try {
                System.out.println("Result: "+future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        service.shutdown();

    }
}
