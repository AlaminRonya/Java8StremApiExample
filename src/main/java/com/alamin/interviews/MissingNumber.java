package com.alamin.interviews;

public class MissingNumber {
    private static boolean[] cache;
    public static void main(String[] args) {
        int[] arr = {0,2,4,1,3,6,7,8};
        cache = new boolean[arr.length+1];
        System.out.println(findMissingUnsortedArray(arr));
        System.out.println(findMissingUnsortedArray2(arr));
        System.out.println(findMissingUnsortedArray3(arr));
    }
    public static int findMissingUnsortedArray(int[] arr){
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        for (Integer num: arr){
            sum -= num;
        }
        return sum;
    }
    public static int findMissingUnsortedArray2(int[] arr){
        for (int num : arr) {
            cache[num] = true;
        }
        for (int i = 0; i <= arr.length; i++) {
            if (!cache[i]){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
    public static int findMissingUnsortedArray3(int[] nums){
        int length = nums.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            result ^= nums[i];
        }
        for (int i = 0; i <= length; i++) {
            result ^= i;
        }
        return result;
    }
}
