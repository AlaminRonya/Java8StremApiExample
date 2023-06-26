package com.alamin.interviews;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class ValidParentheses {
    private static final String OPEN_BRACKETS = "({[";
    private static final String CLOSED_BRACKETS = ")}]";
    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("({({())"));
    }
    public boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOpenBracket(c)){
                stack.push(c);
            }else {
                if (stack.isEmpty() || !isMatching(stack.pop(), c)){
                    return false;
                }
            }

        }
        return true;
    }

    private boolean isMatching(Character open, char c) {
        return OPEN_BRACKETS.indexOf(open) == CLOSED_BRACKETS.indexOf(c);
    }

    private boolean isOpenBracket(char c) {
        return OPEN_BRACKETS.indexOf(c) != -1;
    }
}
