package com.alamin.esay_java;

import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
        String s1 = ")()())";
        System.out.println(longestValidParentheses(s1));
    }

    private static boolean isValid(String s) {
        Stack<Character> store = new Stack<>();
        char[] arr = s.toCharArray();
        for (char value : arr) {
            if (value == ')' || value == '}' || value == ']') {
                if (store.isEmpty()) {
                    return false;
                }
                char c = store.peek();
                if (c == '(' && value == ')') {
                    store.pop();
                    continue;
                } else if (c == '{' && value == '}') {
                    store.pop();
                    continue;
                } else if (c == '[' && value == ']') {
                    store.pop();
                    continue;
                } else {
                    return false;
                }
            }
            store.add(value);
        }
        return true;
    }
    public static int longestValidParentheses(String s) {
        if (s == null) return 0;
        Stack<Character> store = new Stack<>();
        int count = 0;
        char[] arr = s.toCharArray();
        for (char value : arr) {
            if (value == ')') {
                if (store.isEmpty()) {
                    store.add(value);
                    continue;
                }
                char c = store.peek();
                if (c == '(') {
                    store.pop();
                    count++;
                    continue;
                }
                store.add(value);
            }

            store.add(value);
        }
        while (store.pop() == '(') count++;
        return count;
    }
}
