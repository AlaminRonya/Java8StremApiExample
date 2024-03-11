package com.alamin.java_concurrency.phaser;

import java.util.concurrent.Phaser;

public class PhaserExample {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int countPhaser;
        System.out.println("Starting........");
        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");
        countPhaser = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+countPhaser+ " Completed");
        countPhaser = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+countPhaser+ " Completed");
        countPhaser = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+countPhaser+ " Completed");
        phaser.arriveAndDeregister();
        if (phaser.isTerminated()){
            System.out.println("Phaser is terminated");
        }
    }
}
