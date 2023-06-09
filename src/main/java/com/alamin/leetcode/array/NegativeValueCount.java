package com.alamin.leetcode.array;

import java.util.Arrays;

public class NegativeValueCount {
    public static void main(String[] args) {
//        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
//        int count = countNegatives(grid);
//        System.out.println(count);
        int[] nums = {3,2,2,3};
        int val = 3;
        int a = removeElement(nums, val);
        System.out.println("A: "+a);

    }
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static int removeElement(int[] nums, int val) {
        int t = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[t] = nums[i];
            t++;
        }
        for (Integer n: nums){
            System.out.println(n);
        }
        return t;
    }
}
