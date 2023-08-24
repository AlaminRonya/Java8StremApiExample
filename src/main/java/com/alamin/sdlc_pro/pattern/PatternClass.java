package com.alamin.sdlc_pro.pattern;

public class PatternClass {
    public static void main(String[] args) {
        int n = 7;
//        int[][] spiralOrder = spiral(n);
//        for (int i =0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(" "+spiralOrder[i][j]);
//            }
//            System.out.println();
//        }

        print(n);

    }


    public static int[][]  spiral(int n){
        int[][] matrix = new int[n][n];
        if (n == 0) return matrix;
        int rowBegin = 0;
        int rowEnd = n - 1;
        int columnBegin = 0;
        int columnEnd = n - 1;
        int v = n;

        while (rowBegin <= rowEnd && columnBegin <= columnEnd){

            // TODO: Column traverse left to right
            for (int i=columnBegin; i <= columnEnd; i++){
                matrix[rowBegin][i] = v;
            }
            // TODO: Increasing begin row
            rowBegin++;

            // TODO: Row traverse up to down
            for (int i = rowBegin; i <= rowEnd; i++){
                matrix[i][columnEnd] = v;
            }
            // TODO: Decreasing end column
            columnEnd--;

            // TODO: Column traverse right to left
            if (rowBegin <= rowEnd){
                for (int i = columnEnd; i >= columnBegin; i--){
                    matrix[rowEnd][i] = v;
                }
            }
            // TODO: Decreasing end of row
            rowEnd--;

            // TODO: Column traverse down to up
            if (columnBegin <= columnEnd){
                for (int i = rowEnd; i >= rowBegin; i--){
                    matrix[i][columnBegin] = v;
                }
            }
            // TODO: Increasing Begin column
            columnBegin++;
            v--;

        }

        return matrix;
    }

    private static void print(int n){
        for (int i = 0; i < 2*n - 1; i++) {
            for (int j = 0; j < 2*n - 1; j++) {
                int right = (2*n - 2) - j;
                int down = (2*n - 2) - i;
                System.out.print(" "+(n- Math.min(Math.min(i, down), Math.min(j, right))));
            }
            System.out.println();
        }
    }

}
