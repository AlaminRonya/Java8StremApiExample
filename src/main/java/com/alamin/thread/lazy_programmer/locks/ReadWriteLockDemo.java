package com.alamin.thread.lazy_programmer.locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    private static final ReadWriteLock resource = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        // Acquiring Read Lock
        resource.readLock().lock();
        try {
            System.out.println("Reading from a Shared Resource");
            // Some read operation

        }finally {
            resource.readLock().unlock();
        }
        // Acquiring Write Lock (Exclusive)
        resource.writeLock().lock();
        try {
            System.out.println("Writing to a Shared Resource");
            // Some write operation

        }finally {
            resource.writeLock().unlock();
        }
    }
}
