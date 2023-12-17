package com.alamin.thread.thread_pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {
    private BlockingQueue taskQueue = null;
    private List<PoolThreadRunnable> runnables = new ArrayList<>();
    private boolean isStopped = false;

    public ThreadPool(int noOfThreads, int maxNoOfTasks) {
        this.taskQueue = new ArrayBlockingQueue(maxNoOfTasks);
        for (int i = 0; i < noOfThreads; i++) {
            PoolThreadRunnable poolThreadRunnable = new PoolThreadRunnable(taskQueue);
            runnables.add(poolThreadRunnable);
        }
        for (PoolThreadRunnable runnable: this.runnables){
            new Thread(runnable).start();
        }
    }
    public synchronized void execute(Runnable task) throws Exception{
        if (this.isStopped){
            throw new IllegalStateException("ThreadPool is stopped!!!!!");
        }
        this.taskQueue.offer(task);
    }
    public synchronized void stop(){
        this.isStopped = true;
        for (PoolThreadRunnable runnable: this.runnables){
            runnable.doStop();
        }
    }
    public synchronized void waitUntilAllTasksFinished(){
        while (this.taskQueue.size() > 0){
            try {
                Thread.sleep(1);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
