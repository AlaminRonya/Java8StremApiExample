package com.alamin.thread.lazy_programmer;

public class ResourceSharingThread {
    private static int count = 0;
    public static synchronized void print(){
//        synchronized (this){
            for (int i = 0; i < 1000000; i++) {
                System.out.println( Thread.currentThread().getName()+" : "+i);
                count++;
//            }

//            try {
//                Thread.sleep((long) (3000* Math.random()));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println(Thread.currentThread().getName()+" Count: "+count);

    }



}