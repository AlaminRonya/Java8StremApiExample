package com.alamin.esay_java;


import java.util.ArrayList;
import java.util.List;

public class Spiral_II {
    public static void main(String[] args) {
        int n = 7;
        int[][] spiralOrder = spiralOrder(n);
        for (int i =0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(" "+spiralOrder[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][]  spiralOrder(int n){
        int[][] matrix = new int[n][n];
        if (n == 0) return matrix;
        int rowBegin = 0;
        int rowEnd = n - 1;
        int columnBegin = 0;
        int columnEnd = n - 1;
        int v = 1;

        while (rowBegin <= rowEnd && columnBegin <= columnEnd){

            // TODO: Column traverse left to right
            for (int i=columnBegin; i <= columnEnd; i++){
                matrix[rowBegin][i] = v++;
            }
            // TODO: Increasing begin row
            rowBegin++;

            // TODO: Row traverse up to down
            for (int i = rowBegin; i <= rowEnd; i++){
                matrix[i][columnEnd] = v++;
            }
            // TODO: Decreasing end column
            columnEnd--;

            // TODO: Column traverse right to left
            if (rowBegin <= rowEnd){
                for (int i = columnEnd; i >= columnBegin; i--){
                    matrix[rowEnd][i] = v++;
                }
            }
            // TODO: Decreasing end of row
            rowEnd--;

            // TODO: Column traverse down to up
            if (columnBegin <= columnEnd){
                for (int i = rowEnd; i >= rowBegin; i--){
                    matrix[i][columnBegin] = v++;
                }
            }
            // TODO: Increasing Begin column
            columnBegin++;

        }

        return matrix;
    }
}
