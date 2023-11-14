package com.alamin.interviews.array;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        print(arr2d);
//        transpose(arr2d);
//        print(arr2d);
//        printZigZag(arr2d);
        printBoundaryElementsClockwise(arr2d);
        printBoundaryElementsAnticlockwise(arr2d);
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
        if (arr.length < 1){
            return;
        }
        int row = arr.length;
        int column = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }
    private static void printZigZag(int[][] arr){
        if (arr.length < 1){
            return;
        }
        int row = arr.length;
        int column = arr[0].length;

        for (int i = 0; i < row; i++) {
            if (i%2 == 0){
                for (int j = 0; j < column; j++) {
                    System.out.print(arr[i][j]+", ");
                }
            }else {
                for (int j = column-1; j >= 0; j--) {
                    System.out.print(arr[i][j]+", ");
                }
            }

            System.out.println();
        }
        System.out.println("---------------------------");
    }
    private static void printBoundaryElementsClockwise(int[][] arr){

        int length = arr.length;

        int i = 0, j = 0;
        for (j = 0; j < length; j++) {
            System.out.print(arr[i][j]+", ");
        }
        j = length - 1;
        for (i = 1; i < length; i++) {
            System.out.print(arr[i][j]+", ");
        }
        i = length - 1;
        for (j = length - 2; j >= 0; j--) {
            System.out.print(arr[i][j]+", ");
        }
        j = 0;
        for (i = length - 2; i > 0; i--) {
            System.out.print(arr[i][j]+", ");
        }
        System.out.println();
        System.out.println("---------------------------");
    }

    private static void printBoundaryElementsAnticlockwise(int[][] arr){

        int length = arr.length;

        int i = 0, j = 0;
        for (i = 0; i < length; i++) {
            System.out.print(arr[i][j]+", ");
        }
        i = length - 1;
        for (j = 1; j < length; j++) {
            System.out.print(arr[i][j]+", ");
        }
        j = length - 1;
        for (i = length - 2; i >= 0; i--) {
            System.out.print(arr[i][j]+", ");
        }
        i = 0;
        for (j = length - 2; j > 0; j--) {
            System.out.print(arr[i][j]+", ");
        }
        System.out.println();
        System.out.println("---------------------------");
    }

}
