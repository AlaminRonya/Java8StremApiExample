package com.alamin.interviews.array;

public class FindTheMaximumSubarraySum {
    public static void main(String[] args) {

    }
    private static int findTheMaximumSubarraySum(int[] nums){
        int length = nums.length;
        if (length < 1){
            return Integer.MIN_VALUE;
        }
        int maxSum = nums[0];
        int sum = nums[0];
        for (int i = 0; i < length; i++) {
            if (sum > nums[i]){
                sum = sum + nums[i];
            }else {
                sum = nums[i];
            }
        }
        if ( sum > maxSum ){
            maxSum = sum;
        }
        return maxSum;
    }
}
