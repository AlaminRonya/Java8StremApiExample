package com.alamin.interviews.binary_search;

public class BooksAllocation {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int numberOfStudents = 2;
        System.out.println(maxPage(arr, numberOfStudents));
    }
    private static boolean isPossible(int[] arr, int numberOfStudents, int mid){
        int students = 1;
        int studentPageCount = 0;
        for (int value : arr) {
            if (value > mid) {
                return false;
            }
            if (studentPageCount + value <= mid) {
                studentPageCount = studentPageCount + value;
            } else {
                students++;
                if (students > numberOfStudents) {
                    return false;
                }
                studentPageCount = value;
            }
        }
        return true;
    }

    private static int maxPage(int[] arr, int numberOfStudents){
        if (numberOfStudents > arr.length){
            return Integer.MIN_VALUE;
        }
        int lowest = arr[0];
        int highest = 0;
        int result = 0;
        for (int value: arr){
            if (value < lowest){
                lowest = value;
            }
            highest += value;
        }
        while (lowest <= highest){
            int mid = (lowest+highest)/2;
            if (isPossible(arr, numberOfStudents, mid)){
                result = mid;
                highest = mid - 1;
            }else {
                lowest = mid + 1;
            }
        }
        return result;
    }

}
