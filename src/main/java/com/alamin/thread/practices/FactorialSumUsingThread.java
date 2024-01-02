package com.alamin.thread.practices;

import java.util.HashMap;
import java.util.Map;

public class FactorialSumUsingThread implements Runnable {
    private volatile Map<Long, Long> memo = new HashMap<>();
    private long number;
    private long sumOfOdd=0;
    private long sumOfEven=0;
    private final Object lock = new Object();

    public FactorialSumUsingThread(int n) {
        this.number = n;
    }

    public static void main(String[] args) {
        FactorialSumUsingThread factorialSumUsingThread = new FactorialSumUsingThread(20);
        Thread thread1 = new Thread(factorialSumUsingThread,"THREAD-EVEN");
        Thread thread2 = new Thread(factorialSumUsingThread,"THREAD-ODD");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of Even: "+factorialSumUsingThread.sumOfEven+"\nSum of Odd: "+factorialSumUsingThread.sumOfOdd);
        for(Long key: factorialSumUsingThread.memo.keySet()){
            System.out.println("p:"+Integer.MAX_VALUE);
            System.out.println(factorialSumUsingThread.memo.get(key));
        }
    }

    @Override
    public void run() {
        while (number>0) {
            synchronized (lock) {
                number--;
                System.out.println(number);
                if (number % 2 != 0) {
                    sumOfOdd += fact(number);
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                    }
                }else {
                    sumOfEven+=fact(number);
                    lock.notify();
                }
            }
        }
    }

    private long fact(long n){
        if (n == 0 || n == 1){
            return 1;
        }
        if (memo.containsKey(n)){
            return memo.get(n);
        }
        long result = n*fact(n-1);
        memo.put(n, result);
        return result;
    }
}
