package com.alamin.interviews.array;

import java.util.ArrayList;
import java.util.List;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        showOfSubArray(arr);
        System.out.println(divideLengthOfSubArray(arr, 2));
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
    private static List<List<Integer>> divideLengthOfSubArray(int[] arr, int k){
        List<List<Integer>> result = new ArrayList<>();
        int iIndex = 0;
        int length = arr.length;
        while (iIndex < length){
            int jIndex = iIndex;
            List<Integer> row = new ArrayList<>();
            while (jIndex < length && jIndex < k + iIndex ){
                row.add(arr[jIndex++]);
            }
            result.add(row);
            iIndex += k;
        }
        return result;
    }
}
