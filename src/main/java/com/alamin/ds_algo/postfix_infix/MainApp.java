package com.alamin.ds_algo.postfix_infix;

import static com.alamin.ds_algo.postfix_infix.EvaluatePostfix.evaluatePostfix;
import static com.alamin.ds_algo.postfix_infix.InfixToPostfix.infixToPostfix;

public class MainApp {
    public static void main(String[] args) {

        System.out.println(infixToPostfix("4 * 5 + 6 / 7 / 8 / 9"));

        System.out.println("==========================================");

        System.out.println(evaluatePostfix("100 200 + 2 / 5 * 7 + 50 %"));

    }
}
