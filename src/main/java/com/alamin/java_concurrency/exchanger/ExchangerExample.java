package com.alamin.java_concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        // Create two threads for data exchange
        DataExchangeThread thread1 = new DataExchangeThread(exchanger, "Data from Thread 1");
        DataExchangeThread thread2 = new DataExchangeThread(exchanger, "Data from Thread 2");
        DataExchangeThread thread3 = new DataExchangeThread(exchanger, "Data from Thread 3");
        DataExchangeThread thread4 = new DataExchangeThread(exchanger, "Data from Thread 3");

        // Start the threads
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        thread3.start();
//        thread4.start();
    }
}