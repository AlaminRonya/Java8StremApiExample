package com.alamin.interviews.array;

public class RemoveOfDuplaaedElement {
    public static void main(String[] args) {

    }
    private static int removeOfDuplicatedElement(int[] arr){
        int len = arr.length;
        if (len == 0){
            return -1;
        }
        int index =0;
        for (int i = 1; i < len; i++) {
            if (arr[index] != arr[i]){
                index++;
                arr[index] = arr[i];
            }
        }
        return index;
    }
}
