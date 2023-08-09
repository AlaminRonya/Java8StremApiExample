package com.alamin.esay_java;


import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && columnBegin <= columnEnd){

            // TODO: Column traverse left to right
            for (int i=columnBegin; i <= columnEnd; i++){
                res.add(matrix[rowBegin][i]);
            }
            // TODO: Increasing begin row
            rowBegin++;

            // TODO: Row traverse up to down
            for (int i = rowBegin; i <= rowEnd; i++){
                res.add(matrix[i][columnEnd]);
            }
            // TODO: Decreasing end column
            columnEnd--;

            // TODO: Column traverse right to left
            if (rowBegin <= rowEnd){
                for (int i = columnEnd; i >= columnBegin; i--){
                    res.add(matrix[rowEnd][i]);
                }
            }
            // TODO: Decreasing end of row
            rowEnd--;

            // TODO: Column traverse down to up
            if (columnBegin <= columnEnd){
                for (int i = rowEnd; i >= rowBegin; i--){
                    res.add(matrix[i][columnBegin]);
                }
            }
            // TODO: Increasing Begin column
            columnBegin++;

        }

        return res;
    }
}
