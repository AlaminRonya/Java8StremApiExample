package com.alamin.interviews.bit_maipulation;

public class MaxAndPair {
    public static void main(String[] args) {
        int[] nums = {16, 9, 6, 13};

        System.out.println(maxAndPair(nums));
    }
    private static int checkBits(int[] nums, int mask){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((mask & nums[i]) == mask){
                count++;
            }
        }
        return count;
    }

    private static int maxAndPair(int[] nums){
        int mask = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            mask = res | (1 << i);
            int count = checkBits(nums, mask);
            if (count >= 2){
                res = res | mask;
            }
        }
        return res;
    }
}
