package com.alamin.thread.lazy_programmer.producer_consumer;

public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueueBuffer buffer = new BlockingQueueBuffer(10);
        for (int i = 0; i < 5; i++) {
            Producer producer = new Producer(buffer);
            Thread thread = new Thread(producer);
            thread.start();
        }
        Consumer consumer = new Consumer(buffer);
        Thread thread1 = new Thread(consumer);
        thread1.start();
    }
}
