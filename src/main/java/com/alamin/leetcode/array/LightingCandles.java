package com.alamin.leetcode.array;

public class LightingCandles {
    public static void main(String[] args) {
        int K = 3;
        int[] candles = {-30, -10, 10, 20, 50};

        // Calculate the minimum time
        int minTime = calculateMinTime(candles, K);

        // Output the result
        System.out.println(minTime);
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
