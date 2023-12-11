package com.alamin.thread.lazy_programmer.instance_synchronization;

public class InstanceStaticPropertySynchronizationResource {
    private static int count = 0;

    public synchronized int getSynchronizedMethod() {
        System.out.println("Thread Name: "+Thread.currentThread().getName()+" & count: "+count);
        return count;
    }

    public synchronized void setSynchronizedMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread Name: "+Thread.currentThread().getName()+" & count: "+count);
            count++;
        }
    }
    public int getSynchronizedBlock() {
        synchronized (this){
            System.out.println("Thread Name: "+Thread.currentThread().getName()+" & count: "+count);
            return count;
        }

    }

    public void setSynchronizedBlock() {
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread Name: "+Thread.currentThread().getName()+" & count: "+count);
                count++;
            }
        }
    }
}
