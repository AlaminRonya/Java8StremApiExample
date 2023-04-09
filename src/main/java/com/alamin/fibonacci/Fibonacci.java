package com.alamin.fibonacci;

import java.util.List;
import java.util.stream.Stream;

public class Fibonacci {
    static void fibonacciSeries(int n){

        List<Integer> values = Stream.iterate(
                new int[]{0, 1}, //Base Case
                t -> new int[]{t[1], t[0] + t[1]} //Statement
        ).limit(n).map(v -> v[0]).toList();

        System.out.println("Fibonacci series: "+values);
    }
    static void checkFibonacciNumber(int num){

        boolean check = Stream.iterate(
                new int[]{0, 1}, //Base Case
                x -> x[0] <= num, //Loop break Condition
                t -> new int[]{t[1], t[0] + t[1]} //Statement
        ).anyMatch(x -> x[0] == num); //Check value

        String s = (check) ? num + " is fibonacci number." : num + " is not fibonacci number.";
        System.out.println(s);

    }
    public static void main(String[] args) throws Exception {
        fibonacciSeries(10);
        checkFibonacciNumber(50);
    }
}
