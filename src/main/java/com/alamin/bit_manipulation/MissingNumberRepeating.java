package com.alamin.bit_manipulation;

public class MissingNumberRepeating {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,5};
        int[] missingAndRepeating = missingAndRepeating(nums);
        System.out.println(missingAndRepeating[0]);
        System.out.println(missingAndRepeating[1]);
    }
    public static int[] missingAndRepeating(int[] nums){
        int allXor = 0;
        for (int i = 0; i <= nums.length; i++) {
            allXor = allXor ^ i;
        }
        for (int i = 0; i < nums.length; i++) {
            allXor = allXor ^ nums[i];
        }
        // return allXor; // Missing Number not repeating number of array
        int find, c=0;
        while (allXor != 0){
            allXor = allXor & (1 << c);
            if (allXor != 0){
               break;
            }
            c++;
        }
        int left=0, right=0;
        for (int i = 1; i <= nums.length; i++) {
            int a = i & (1<<c);
            if (a != 0){
                left = left ^ i;
            } else {
                right = right ^ i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i] & (1<<c);
            if (a != 0){
                left = left ^ nums[i];
            } else {
                right = right ^ nums[i];
            }
        }
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == left){
                flag = false;
                break;
            }
        }
        if (flag){
            return new int[]{right, left};
        }
        return new int[]{left, right};
    }
}
