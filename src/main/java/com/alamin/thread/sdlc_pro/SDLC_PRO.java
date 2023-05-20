package com.alamin.thread.sdlc_pro;
class MyThread extends Thread{
//    public MyThread() {
//        super();
//    }

    @Override
    public void run() {
        System.out.println("MyThread->");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        for (int i=0; i<10; i++){
//            System.out.println("MyThread->"+i);
//            try {
//                Thread.sleep(10000);
//            }catch (InterruptedException e){
//                throw new RuntimeException();
//            }
//        }
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("MyRunnable Thread=>"+Thread.currentThread().getName());
        for (int i=0; i<10; i++){
            System.out.println("MyRunnable->"+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
        }
    }
}
public class SDLC_PRO {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello word");
        Thread thread = Thread.currentThread();
        thread.getThreadGroup().getParent().list();
        System.out.println("***************");

        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        myThread.start(); // Runnable state
        System.out.println(myThread.getState());
        Thread.sleep(1000);
        System.out.println(myThread.getState());
        Thread.sleep(4000);
        System.out.println(myThread.getState());

        MyRunnable myRunnable = new MyRunnable();
//        Thread t = new Thread(myRunnable);
        Thread t = new Thread(myRunnable, "Thread Name");
//        t.start(); // Asynchronize way thread call
        t.run(); // Single way thread call

        System.out.println("Main Thread=>"+Thread.currentThread().getName());
        for (int i=0; i<10; i++){
            System.out.println("Main Thread->"+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
        }
    }
}
