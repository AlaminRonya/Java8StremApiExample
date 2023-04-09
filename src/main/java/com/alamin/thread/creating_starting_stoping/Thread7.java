package com.alamin.thread.creating_starting_stoping;

// TODO: 4/9/2023 stop of java thread
public class Thread7 {
    public static class StoppableRunnable implements Runnable{
        private boolean stopRequested = false;
        public synchronized void requestStop(){
            this.stopRequested = true;
        }
        public synchronized boolean isStopRequested(){
            return this.stopRequested;
        }
        private void sleep(long millis){
            try {
                Thread.sleep(millis);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" is running...");
            while (!isStopRequested()){
                sleep(1000);
                System.out.println("..............");
            }
            System.out.println(threadName+" finished.");
        }
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable, "Thread1");
        thread.start();
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("requesting stop");
        stoppableRunnable.requestStop();
        System.out.println("stop requested");

        Thread thread1 = new Thread(stoppableRunnable, "Thread2");
        thread1.start();

    }
}
