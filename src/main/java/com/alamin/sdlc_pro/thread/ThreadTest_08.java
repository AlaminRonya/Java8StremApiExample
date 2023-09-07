package com.alamin.sdlc_pro.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest_08 {
    List<Integer> list = new ArrayList<>();
    public synchronized void addEven(int value){
        list.add(value);
    }
    public synchronized void addOdd(int value){
        list.add(value);
    }
    public static void main(String[] args) {
        ThreadTest_08 obj = new ThreadTest_08();
//        ThreadTest_08 obj1 = new ThreadTest_08();
        Thread t0 =  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2000000; i++) {
                    if (i % 2 == 0){
                        obj.addEven(i);
                    }
                }
            }
        });
        Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2000000; i++) {
                    if (i % 2 != 0){
                        obj.addOdd(i);
                    }
                }
            }
        });
        t0.start();
        t1.start();
        while (t0.isAlive() || t1.isAlive()){
            System.out.println(t0.getState()+" : "+t1.getState());
        }
//        System.out.println(obj.list);

    }
}
