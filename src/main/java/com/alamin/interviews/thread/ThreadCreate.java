package com.alamin.interviews.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadCreate {
    public static void main(String[] args) {
        System.out.println("Thread Start............");
        for (int i = 0; i < 10; i++) {
            ThreadImpl t = new ThreadImpl();
            t.execute();
        }
        System.out.println("Thread End..............");
        System.out.println("Thread Start............");
        for (int i = 0; i < 10; i++) {
            ThreadImpl t = new ThreadImpl();
            t.start();
        }
        System.out.println("Thread End..............");
        System.out.println("Thread Start............");
        for (int i = 0; i < 10; i++) {
            RunnableImpl runnable = new RunnableImpl();
            Thread t = new Thread(runnable, "Runnable-Thread:"+i);
            t.start();
        }
        System.out.println("Thread End..............");
        System.out.println("Thread Start............");
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(()->{
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException ex){
                    Logger.getLogger(ThreadImpl.class.getName()).log(Level.SEVERE, ex.getMessage());
                }
                System.out.println("Executing Thread=>: "+Thread.currentThread().getName());

            });
            t.start();
        }
        System.out.println("Thread End..............");
        System.out.println("Thread Start..............");
        Runnable task = ()->{
            try{
                Thread.sleep(2000);
            }catch (InterruptedException ex){
                Logger.getLogger(ThreadImpl.class.getName()).log(Level.SEVERE, ex.getMessage());
            }
            System.out.println("Executing Thread=>: "+Thread.currentThread().getName());
        };
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(task);
            t.start();
        }
        System.out.println("Thread End..............");

    }
}
class ThreadImpl extends Thread{
    public void execute(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            Logger.getLogger(ThreadCreate.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        System.out.println("Executing Thread: "+Thread.currentThread().getName());

    }

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            Logger.getLogger(ThreadImpl.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        System.out.println("Executing Thread: "+Thread.currentThread().getName());

    }
}

class RunnableImpl implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            Logger.getLogger(ThreadImpl.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        System.out.println("Executing Thread: "+Thread.currentThread().getName());

    }
}