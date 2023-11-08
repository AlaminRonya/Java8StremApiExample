package com.alamin.interviews.array;

public class InverseOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        inverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
    private static void inverse(int[] arr){
        int length = arr.length;
        if (length < 2){
            return;
        }
        int leftIndex = 0, rightIndex = length - 1;
        while (leftIndex < rightIndex){
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }
}
