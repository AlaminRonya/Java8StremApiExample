package com.alamin.thread.lazy_programmer;

public class PrintEvenAndOddNumbersUsingThread {
    public static void main(String[] args) {
        Printer p1 = new Printer(0, 10, 0);
        Printer p2 = new Printer(0, 10, 1);
        Thread t1 = new Thread(p1, "T1");
        Thread t2 = new Thread(p2, "T2");
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()){}
    }
}
class Printer implements Runnable{
    private static int number;
    private final int maxNumber;
    private final int remainder;
    static Object lock;

    public Printer(int number, int maxNumber,  int remainder) {
        Printer.number = number;
        this.maxNumber = maxNumber;
        this.remainder = remainder;
        lock = new Object();
    }

    @Override
    public void run() {
        while (number<maxNumber){
            synchronized (lock){
                while (number%2 != remainder){
                    try{
                        lock.wait();
                    }catch (InterruptedException ex){

                    }
                }
                System.out.println(Thread.currentThread().getName()+" : "+number++);

                lock.notify();
            }
        }
    }
}