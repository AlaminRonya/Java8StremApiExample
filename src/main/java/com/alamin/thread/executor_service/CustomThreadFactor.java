package com.alamin.thread.executor_service;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactor implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.setDaemon(false);
//        thread.setName();
        return thread;
    }
}
