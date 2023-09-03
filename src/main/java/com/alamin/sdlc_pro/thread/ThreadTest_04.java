package com.alamin.sdlc_pro.thread;
// TODO: 03/09/2023 Interrupt is thread
public class ThreadTest_04 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                for (int i = 0; i < 10000; i++){
                    System.out.println(thread.getName() + " : "+ thread.isInterrupted() + " : "+i);
                    if ( i > 5000 && thread.isInterrupted()){
                        break;
                    }
                }
            }
        });
        t.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();

    }
}
