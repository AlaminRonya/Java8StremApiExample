package com.alamin.thread.lazy_programmer.producer_consumer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable{
    private final BlockingQueueBuffer buffer;

    public Consumer(BlockingQueueBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true){
            try {
                int item = buffer.consume();
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
