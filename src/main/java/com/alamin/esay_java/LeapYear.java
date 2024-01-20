package com.alamin.esay_java;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2023; // Replace with the desired year

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    public static boolean isLeapYear(int year) {
        // Leap year logic
        // A year is a leap year if it is divisible by 4
        // But, if it is divisible by 100, it must also be divisible by 400 to be a leap year
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
