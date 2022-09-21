package com.alamin.flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapFunctionalInterface {
    static List<Integer> oddNumber = Arrays.asList(1,3,5,7,8);
    static List<Integer> evenNumber = Arrays.asList(2,4,6,8);
    public static void main(String[] args) {
        List<List<Integer>> allNumbers = Arrays.asList(oddNumber, evenNumber);
        System.out.println(allNumbers);
        List<Integer> flatMapList = allNumbers.stream().flatMap(Collection::stream).distinct().toList();
        System.out.println(flatMapList);

    }
}
