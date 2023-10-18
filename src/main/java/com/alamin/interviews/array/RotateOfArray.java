package com.alamin.interviews.array;

import java.util.Arrays;

public class RotateOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 5;
        rotateOfArray(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    private static void rotateOfArray(int[] nums, int k){
        k = k % nums.length;
        reverseOfArray(nums, 0, nums.length-1);
        reverseOfArray(nums, 0, k-1);
        reverseOfArray(nums, k, nums.length-1);
    }
    private static void reverseOfArray(int[] nums, int leftIndex, int rightIndex){
        while (leftIndex < rightIndex){
            int temp = nums[leftIndex];
            nums[leftIndex] = nums[rightIndex];
            nums[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }
}
