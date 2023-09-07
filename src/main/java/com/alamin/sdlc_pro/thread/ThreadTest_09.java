package com.alamin.sdlc_pro.thread;
class Main{
    public synchronized static void staticMethod(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Static Method: Thread name is "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static synchronized void nonStaticMethod(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Non-Static Method: Thread name is "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadTest_09 {
    public static void main(String[] args) {
        Main main = new Main();
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.staticMethod();
            }
        });
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.staticMethod();
            }
        });
        t0.start();
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.nonStaticMethod();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.nonStaticMethod();
            }
        });
        t2.start();
        t3.start();

//
//        while (t0.isAlive() || t1.isAlive() ){
////            System.out.println(t0.getState()+" : "+t1.getState());
//        }


//        while (t2.isAlive() || t3.isAlive()){
////            System.out.println(t0.getState()+" : "+t1.getState());
//        }

    }
}
