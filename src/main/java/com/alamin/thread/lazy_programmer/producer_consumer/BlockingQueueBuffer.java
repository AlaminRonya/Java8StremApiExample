package com.alamin.thread.lazy_programmer.producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueBuffer {
    BlockingQueue<Integer> buffer;
    public BlockingQueueBuffer(int capacity) {
        this.buffer = new ArrayBlockingQueue<>(capacity);
    }

    public void produce(int item) throws InterruptedException {
        buffer.put(item);
        System.out.println("Produced: "+item+" : "+buffer);
    }

    public int consume() throws InterruptedException {
        int item = buffer.take();
        System.out.println("Consumed: "+item+" : "+buffer);
        return item;
    }
}
