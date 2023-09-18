package com.alamin.leetcode.array;

import java.util.Arrays;

public class ProductSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        var result = productSum(nums);
        System.out.println(Arrays.toString(result));
    }
    private static int[] productSum(int[] nums){
        int N = nums.length;
        int[] output = new int[N];
        output[0] = 0;
        for (int i = 1; i < N; i++) {
            output[i] = nums[i-1] + output[i-1];
        }
        int R = 0;
        for (int i = N-1; i >= 0 ; i--){
            output[i] = output[i] + R;
            R = R + nums[i];
        }
        return output;
    }
}
