package com.alamin.thread.practices;

public class EvenAndOddSumUsingThread implements Runnable {
    private int number;
    private int sumOfOdd=0;
    private int sumOfEven=0;
    private final Object lock = new Object();

    public EvenAndOddSumUsingThread(int n) {
        this.number = n;
    }

    public static void main(String[] args) {
        EvenAndOddSumUsingThread evenAndOddNumber = new EvenAndOddSumUsingThread(0);
        Thread thread1 = new Thread(evenAndOddNumber,"THREAD-EVEN");
        Thread thread2 = new Thread(evenAndOddNumber,"THREAD-ODD");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum of Even: "+evenAndOddNumber.sumOfEven+"\nSum of Odd: "+evenAndOddNumber.sumOfOdd);
    }

    @Override
    public void run() {
        while (number<10000) {
            synchronized (lock) {
                number++;
                System.out.println(number);
                if (number % 2 != 0) {
                    sumOfOdd += number;
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                    }
                }else {
                    sumOfEven+=number;
                    lock.notify();
                }


            }
        }
    }
}
