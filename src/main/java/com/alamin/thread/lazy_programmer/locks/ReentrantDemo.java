package com.alamin.thread.lazy_programmer.locks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemo {
    private static final ReentrantLock resource = new ReentrantLock();

    public static void main(String[] args) {
        // Acquiring Lock
        resource.lock();
        try {
            System.out.println("Inside Outer Critical Section");
            // Perform some operation

            // Reentrant Behavior
            // Start of Nested Critical Section
            resource.lock();
            try {

            }finally {
                resource.unlock();
            }

        }finally {
            resource.unlock();
        }
    }
}
