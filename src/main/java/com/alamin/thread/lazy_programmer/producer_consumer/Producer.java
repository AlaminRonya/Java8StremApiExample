package com.alamin.thread.lazy_programmer.producer_consumer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable{
    private final BlockingQueueBuffer buffer;

    public Producer(BlockingQueueBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true){
            try {
                int item = (int) (Math.random()*100);
                buffer.produce(item);
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
