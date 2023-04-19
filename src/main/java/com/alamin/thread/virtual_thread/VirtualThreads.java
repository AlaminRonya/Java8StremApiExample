package com.alamin.thread.virtual_thread;

import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class VirtualThreads {
    static final Logger logger = LoggerFactory.getLogger(VirtualThreads.class);
    static void log(String message){
        logger.info("{} | "+message, Thread.currentThread());
    }
    @SneakyThrows
    private static void sleep(Duration duration) {
        Thread.sleep(duration.toMillis());
    }
    private static void stackOverFlowErrorExample() {
        for (int i = 0; i < 100_000; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(Duration.ofSeconds(1L).toMillis());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }

//    private static Thread virtualThread(String name, Runnable runnable) {
//        return Thread.ofVirtual()
//                .name(name)
//                .start(runnable);
//    }
//    static Thread bathTime() {
//        return virtualThread(
//                "Bath time",
//                () -> {
//                    log("I'm going to take a bath");
//                    sleep(Duration.ofMillis(500L));
//                    log("I'm done with the bath");
//                });
//    }
    public static void main(String[] args) {
        stackOverFlowErrorExample();
        System.out.println("Thread is done!");
    }
}
