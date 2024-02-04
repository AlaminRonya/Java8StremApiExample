package com.alamin.MasterTheFundamentalsOfJava21;

import java.util.Arrays;
import java.util.List;

public class MCQ_2 {
    public static void main(String[] theDoors) {
        int doorNumber = 0;

        List<String> doors = Arrays.asList(
            "A","B","C"
        );
        doors.stream().forEach(e->{
            System.out.println(e + doorNumber++);
        });
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