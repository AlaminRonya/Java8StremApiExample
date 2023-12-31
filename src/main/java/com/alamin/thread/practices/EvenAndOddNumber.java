package com.alamin.thread.practices;

public class EvenAndOddNumber implements Runnable{
    private static int number = 0;
//    private final int maxNumber;
//    private final int remainder;
    private static Object lock = new Object();


    public static void main(String[] args) {
        EvenAndOddNumber evenAndOddNumber = new EvenAndOddNumber();
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
    }


    @Override
    public void run() {
        while (number <=10){
            if (number %2 == 0 && Thread.currentThread().getName().equals("THREAD-EVEN")){
                synchronized (lock){
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+", Value: "+number);
                    number++;
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (number %2 != 0 && Thread.currentThread().getName().equals("THREAD-ODD")){
                synchronized (lock){
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+", Value: "+number);
                    number++;
                    lock.notify();
                }
            }
        }
    }
}
