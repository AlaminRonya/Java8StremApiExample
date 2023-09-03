package com.alamin.sdlc_pro.thread;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        m3();
    }
    static void m3(){
        System.out.println("M3 method: Thread name is "+ Thread.currentThread().getName());
        m4();
        System.out.println("End of method m3");
    }
    static void m4(){
        System.out.println("M4 method: Thread name is "+ Thread.currentThread().getName());
        int a = 15/0;
        System.out.println(a);
        System.out.println("End of method m4");
    }
}
public class ThreadTest_01 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "MyRunnable");
        thread.start();
        m1();
    }

    static void m1(){
        System.out.println("M1 method: Thread name is "+ Thread.currentThread().getName());
        m2();
        System.out.println("End of method m1");
    }
    static void m2(){
        System.out.println("M2 method: Thread name is " + Thread.currentThread().getName());
        int a = 15/0;
        System.out.println(a);
        System.out.println("End of method m2");
    }
}
