package com.alamin.interviews.array;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        print(arr2d);
        transpose(arr2d);
        print(arr2d);
    }
    private static void transpose(int[][] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    private static void print(int[][] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }
}
