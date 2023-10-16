package com.alamin.interviews.array;

public class FindSpecialInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
    }
    public static int findSpecialInteger(int[] arr) {
        int length = arr.length;
        int q = length / 4;
        int k = length - q;
        for(int i = 0; i < k; i++){
            if(arr[i] == arr[i+q]){
                return i;
            }
        }
        return -1;
    }
}
