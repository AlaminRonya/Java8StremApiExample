package com.alamin.thread.wait_notify;

public class ThreadSignalingExampleBasic {
    public static void main(String[] args) {
        Object signalObject = new Object();
        Thread waitingThread = new Thread(()->{
            synchronized (signalObject){
                try {
                    signalObject.wait();
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        });
        Thread notifyThread = new Thread(()->{
            synchronized (signalObject){
                try {
                    signalObject.notify();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        waitingThread.start();
        notifyThread.start();

    }
}
