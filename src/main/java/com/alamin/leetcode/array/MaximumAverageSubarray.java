package com.alamin.leetcode.array;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(new MaximumAverageSubarray().findMaximumAverage(nums,k));
    }
    public double findMaximumAverage(int[] nums, int k){
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double res = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i-k];
            res = Math.max(res, sum);
        }
        return res / k;
    }
}
