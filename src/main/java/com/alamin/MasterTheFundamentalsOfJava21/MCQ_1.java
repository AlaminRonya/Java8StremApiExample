package com.alamin.MasterTheFundamentalsOfJava21;

import java.util.Arrays;
import java.util.List;

public class MCQ_1 {
    public static void main(String[] args) {
        List<String> crew = Arrays.asList(
            "Homer","Bart","Lisa"
        );
        crew.stream().peek(e-> System.out.println(e+":peek"))
                .limit(2)
                .forEach(System.out::println);
    }
}
/**
 * (A).
 * Homer:peek
 * Homer
 * Bart:peek
 * Bart
 */

/**
 * (B).
 * Homer
 * Homer:peek
 * Bart
 * Bart:peek
 */

/**
 * (C).
 * Homer:peek
 * Bart:peek
 * Lisa:peek
 * Homer
 * Bart
 * Lisa
 */

/**
 * (D).
 * Homer:peek
 * Homer
 * Bart:peek
 * Bart
 * Lisa:peek
 * Lisa
 */