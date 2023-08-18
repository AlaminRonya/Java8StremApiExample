package com.alamin.two_pointer;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3};
        int[] result = squaresSorted(nums);
        System.out.println(Arrays.toString(result));
    }
    private static int[] squaresSorted(int[] arr){
        int left = 0;
        int n = arr.length;
        int right = n - 1;
        int index = n - 1;
        int[] res = new int[n];
        while (0 <= index){
            int leftNum = arr[left] * arr[left];
            int rightNum = arr[right] * arr[right];
            if (leftNum < rightNum){
                res[index--] = rightNum;
                right--;
            }else {
                res[index--] = leftNum;
                left++;
            }

        }
        return res;
    }
}
