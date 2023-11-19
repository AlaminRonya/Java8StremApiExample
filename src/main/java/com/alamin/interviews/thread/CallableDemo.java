package com.alamin.interviews.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CallableDemo implements Callable<Integer> {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Main Thread Starts");
        CallableDemo callableDemo = new CallableDemo();
        FutureTask<Integer>[] tasks = new FutureTask[10];
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            tasks[i]  = new FutureTask<>(callableDemo);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        for (int i = 0; i < 10; i++) {
            int result = tasks[i].get(); // This statement blocking state
            System.out.println("Thread "+i+" returned "+result);
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Integer>> futureTaskList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Integer> submittedJob = executorService.submit(callableDemo);
            futureTaskList.add(submittedJob);
        }
        for (Future future: futureTaskList){
            System.out.println("Returned Value: "+future.get());
        }
        executorService.shutdown(); // Not memory leak
        System.out.println("Main Thread Ends");
    }
    @Override
    public Integer call() throws Exception {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            Logger.getLogger(CallableDemo.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        System.out.println("Executing Thread: "+Thread.currentThread().getName());
        return ThreadLocalRandom.current().nextInt(1,100);
    }
}
