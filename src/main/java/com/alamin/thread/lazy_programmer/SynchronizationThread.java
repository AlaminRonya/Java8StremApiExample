package com.alamin.thread.lazy_programmer;

public class SynchronizationThread {
    public static void main(String[] args) {
        ResourceSharingThread resourceSharingThread = new ResourceSharingThread();
        ResourceSharingThread resourceSharingThread1 = new ResourceSharingThread();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                resourceSharingThread.print();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                resourceSharingThread1.print();
            }
        });
//        Thread thread3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                resourceSharingThread.print();
//            }
//        });
//        thread3.start();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

