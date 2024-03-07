package com.alamin.question;

public class Question {
    public static void main(String[] args) {
        Calculator calculator = new AdvanceCalculator(1,2, new int[]{3,4,5});
        System.out.println(calculator.sum());
        System.out.println(calculator.subtract());
    }
}
