package com.alamin.interviews;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,6,7,8};
        System.out.println(findMissingUnsortedArray(arr, arr.length+1));
    }
    public static int findMissingUnsortedArray(int[] arr, int n){
        int sum = (n * (n + 1)) / 2;
        for (Integer num: arr){
            sum -= num;
        }
        return sum;
    }
}
