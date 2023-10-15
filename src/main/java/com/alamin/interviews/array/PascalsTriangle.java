package com.alamin.interviews.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> lists = pascalsTriangle(5);
        System.out.println(lists);
        List<List<Integer>> lists1 = pascalsTriangle1(5);
        System.out.println(lists1);
    }
    public static List<List<Integer>> pascalsTriangle(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j+1));
            }
            result.add(new ArrayList<>(row));
        }
        return result;
    }
    public static List<List<Integer>> pascalsTriangle1(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {

            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j-1));
            }
            row.add(1);
            result.add(new ArrayList<>(row));
        }
        return result;
    }
}
