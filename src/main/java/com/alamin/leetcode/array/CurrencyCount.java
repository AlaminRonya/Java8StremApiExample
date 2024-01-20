package com.alamin.leetcode.array;

import java.util.Scanner;

public class CurrencyCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter amount: ");
//        int amount = scanner.nextInt();

        // Calculate and display the result
//        countNotes(amount);
        countNotes(125);

        System.out.println("-------------------");
        // Input N and K
//        int N = scanner.nextInt();
//        int K = scanner.nextInt();

        // Input candle positions
//        int[] candles = new int[N];
        int K = 3;
        int[] candles = {-30,-10,10,20,50};
//        for (int i = 0; i < N; i++) {
//            candles[i] = scanner.nextInt();
//        }

        // Calculate the minimum time
        int minTime = calculateMinTime(candles, K);

        // Output the result
        System.out.println(minTime);


        scanner.close();
    }
    public static void countNotes(int amount) {
        int[] notes = { 1000, 500, 100, 50, 10, 5, 1 };
        int[] count = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                count[i] = amount / notes[i];
                amount %= notes[i];
            }
        }

        // Display the result
        System.out.println("Currency count:");
        for (int i = 0; i < notes.length; i++) {
            if (count[i] > 0) {
                System.out.println(notes[i] + " " + count[i]);
            }
        }
    }

    public static int calculateMinTime(int[] candles, int K) {
        int minTime = 0;

        // Calculate the initial position of Joy
        int joyPosition = 0;

        // Light the first candle at the initial position
        K--;

        // Calculate the time to light the remaining candles
        for (int i = 0; i < K; i++) {
            // Calculate the distance to the next candle
            int distance = candles[i + 1] - joyPosition;

            // Move to the candle's position
            joyPosition += distance;

            // Increment the time
            minTime += distance;
        }

        return minTime;
    }
}
