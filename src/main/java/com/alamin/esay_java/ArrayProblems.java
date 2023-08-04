package com.alamin.esay_java;

import java.util.Arrays;

public class ArrayProblems {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int p = 2;
        convertToSubArray(arr, p);

    }
    public static void convertToSubArray(int[] arr, int p){
        int n = arr.length;
        int m = n % p;
        int from = 0;
        int to = p;
        while (to <= n){
            int[] ints = Arrays.copyOfRange(arr, from, to);
            for (int a: ints){
                System.out.print(a+",");
            }
            System.out.println();
            from = to;
            to = to+p;
        }
        for (int i = 0; i < m; i++){
            System.out.print(arr[n-1-i]+",");
        }
        System.out.println();


    }
}
