package com.alamin.leetcode.array;

public class NumberOfGoodPairs {
    private static int[] store = new int[101];
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numberIdenticalPairs(nums));

    }
    public static int numberIdenticalPairs(int[] nums){
//        int[] store = new int[101];
        int count =0;
        for(int n: nums){
            count += store[n]++;
        }
        return count;
    }
}
