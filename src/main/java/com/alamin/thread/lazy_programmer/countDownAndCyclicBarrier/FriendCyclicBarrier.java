package com.alamin.thread.lazy_programmer.countDownAndCyclicBarrier;

import com.alamin.thread.lazy_programmer.ScenarioBasedThread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FriendCyclicBarrier implements Runnable{
    private final CyclicBarrier cyclicBarrier;
    private final String friendName;

    public FriendCyclicBarrier(CyclicBarrier cyclicBarrier, String friendName) {
        this.cyclicBarrier = cyclicBarrier;
        this.friendName = friendName;
    }

    @Override
    public void run() {
        try {
            System.out.println(friendName + " is getting ready!!!");
            getReadyAndBeAtMeetingPoint();
            System.out.println(friendName+" is ready and waiting for "+(cyclicBarrier.getParties() - cyclicBarrier.getNumberWaiting() - 1)+" Friends at the Meeting Point");
            cyclicBarrier.await();
            System.out.println(friendName+" is now continuing with the Trip");
        }catch (InterruptedException | BrokenBarrierException ex){
            Logger.getLogger(FriendCyclicBarrier.class.getName()).log(Level.SEVERE, "SLEEP");
        }
    }

    private void getReadyAndBeAtMeetingPoint() {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextLong(5000, 15000));
        }catch (InterruptedException ex){
            Logger.getLogger(FriendCyclicBarrier.class.getName()).log(Level.SEVERE, "SLEEP");
        }
    }
}
