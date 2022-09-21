package com.alamin.UnaryBinaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorFunctionalInterface {
    // TODO: 9/21/2022

    static UnaryOperator<String> uoToUpperCase = String::toUpperCase;
    static UnaryOperator<Integer> uoAddTo10 = v -> v+10;

    static Comparator<Integer> comp = Integer::compareTo;
    static BinaryOperator<Integer> bol = BinaryOperator.maxBy((a,b)->(a > b) ? 1:(a == b) ? 0: -1);
    static BinaryOperator<Integer> bolComp = BinaryOperator.maxBy(comp);


    public static void main(String[] args) {
        System.out.println(uoToUpperCase.apply("Python"));
        System.out.println(uoAddTo10.apply(10));
        System.out.println(bol.apply(102,5));
        System.out.println(bolComp.apply(102,5));
        System.out.println(bolComp.apply(102,500));
    }
}
