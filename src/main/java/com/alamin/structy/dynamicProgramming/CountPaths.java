package com.alamin.structy.dynamicProgramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountPaths {
    private static final Map<List<Integer>, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        List<List<String>> grid = List.of(
                List.of("O", "O", "X"),
                List.of("O", "O", "O"),
                List.of("O", "O", "O")
        );
        System.out.println(countPaths(grid));
    }
    private static int countPaths(List<List<String>>  grid){
        if (grid.size() < 1){
            return Integer.MIN_VALUE;
        }
        return countPaths(0, 0, grid);
    }
    private static int countPaths(int row, int column, List<List<String>> grid){
        int rowLength = grid.size();
        int columnLength = grid.get(0).size();
        if (row == rowLength || column == columnLength){
            return 0;
        }
        if (grid.get(row).get(column).equals("X")){
            return 0;
        }
        if (row == rowLength -1 && column == columnLength - 1){
            return 1;
        }
        List<Integer> position = List.of(row, column);
        if (memo.containsKey(position)){
            return memo.get(position);
        }
        int result = countPaths(row+1, column, grid) + countPaths(row, column+1, grid);
        memo.put(position, result);

        return result;
    }

}
