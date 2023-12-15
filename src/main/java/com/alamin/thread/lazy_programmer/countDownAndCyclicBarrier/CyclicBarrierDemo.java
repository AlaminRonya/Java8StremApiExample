package com.alamin.thread.lazy_programmer.countDownAndCyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    private static final int NO_OF_PARTIES = 5;

    public static void main(String[] args) {
        CyclicBarrier meetingPoint = new CyclicBarrier(NO_OF_PARTIES);
        for (int i = 0; i < NO_OF_PARTIES; i++) {
            FriendCyclicBarrier friend = new FriendCyclicBarrier(meetingPoint, "Friend-"+i);
            Thread thread = new Thread(friend);
            thread.start();
        }
        //System.out.println(Thread.currentThread().getName()+" : Start Hiking");

    }
}
