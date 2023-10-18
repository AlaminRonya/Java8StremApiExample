package com.alamin.interviews.array;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        showOfSubArray(arr);
        divideLengthOfSubArray(arr, 2);
    }
    private static void showOfSubArray(int[] arr){
        int iIndex = 0;
        int length = arr.length;
        while (iIndex < length){
            int jIndex = iIndex;
            while (jIndex < length){
                int kIndex = iIndex;
                while (kIndex <= jIndex){
                    System.out.print(arr[kIndex++]+", ");
                }
                System.out.println();
                jIndex++;
            }
            iIndex++;
        }
    }
    private static void divideLengthOfSubArray(int[] arr, int k){
        int iIndex = 0;
        int length = arr.length;
        while (iIndex < length){
            int jIndex = iIndex;
            System.out.print("[");
            while (jIndex < length && jIndex < k + iIndex ){
                System.out.print(arr[jIndex++]+", ");
            }
            System.out.println("]");
            iIndex += k;
        }
    }
}
