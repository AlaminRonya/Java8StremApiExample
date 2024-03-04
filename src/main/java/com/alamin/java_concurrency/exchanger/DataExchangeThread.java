package com.alamin.java_concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class DataExchangeThread extends Thread {
    private Exchanger<String> exchanger;
    private String data;

    public DataExchangeThread(Exchanger<String> exchanger, String data) {
        this.exchanger = exchanger;
        this.data = data;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " has data: " + data);
            // Exchange data with the other thread
            data = exchanger.exchange(data);
            System.out.println(Thread.currentThread().getName() + " received: " + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
