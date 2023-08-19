package com.alamin.two_pointer;

public class MaxiArea {
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
    private static int maxArea(int[] nums){
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int max = Integer.MIN_VALUE;

        while (l < r){
            int area = (r - l) * Math.min(nums[r], nums[l]);
            max = Math.max(max, area);
            if (nums[l] < nums[r]){
                l++;
            }else {
                r--;
            }
        }
        return max;
    }
}
