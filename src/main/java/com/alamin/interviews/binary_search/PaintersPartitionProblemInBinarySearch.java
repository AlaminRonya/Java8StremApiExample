package com.alamin.interviews.binary_search;

public class PaintersPartitionProblemInBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int numberOfPainters = 2;
        int unitOfTime = 2;
        System.out.println(maxTime(arr, numberOfPainters, unitOfTime));

    }
    private static boolean isPossible(int[] arr, int numberOfPainters, int mid){
        int painters = 1;
        int painterBroadCount = 0;
        for (int value : arr) {
            if (value > mid) {
                return false;
            }
            if (painterBroadCount + value <= mid) {
                painterBroadCount = painterBroadCount + value;
            } else {
                painters++;
                if (painters > numberOfPainters) {
                    return false;
                }
                painterBroadCount = value;
            }
        }
        return true;
    }
    private static int maxTime(int[] arr, int numberOfPainters, int unitOfTime){
        int lowest = 0;
        int highest = 0;
        int result = Integer.MIN_VALUE;
        for (int value : arr) {
            highest += value;
        }
        while (lowest <= highest){
            int mid = (lowest+highest) / 2;

            if (isPossible(arr, numberOfPainters, mid)){
                result = mid;
                highest = mid - 1;
            }else {
                lowest = mid + 1;
            }
        }
        return result * unitOfTime;
    }
}
