package com.alamin.esay_java;

public class MoveToZeros {
    public static void main(String[] args) {

    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n < 2) return;
        int leftPointer = 0;
        int rightPointer = 1;
        while(rightPointer < n){
            if(nums[leftPointer] != 0){
                leftPointer++;
                rightPointer++;
            }else if(nums[rightPointer] == 0){
                rightPointer++;
            }else{
                nums[leftPointer] = nums[rightPointer];
                nums[rightPointer] = 0;
            }
        }
    }
}
