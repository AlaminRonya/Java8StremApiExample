package com.alamin.stream_api;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).filter(v-> v%2 == 0).forEach(System.out::println);
    }
}
