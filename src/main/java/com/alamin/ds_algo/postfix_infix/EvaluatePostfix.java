package com.alamin.ds_algo.postfix_infix;

import org.apache.commons.lang3.StringUtils;

import java.util.Stack;


public class EvaluatePostfix {
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (String component : postfix.split(" ")) {
            if (StringUtils.isNumeric(component)) {
                stack.push(Integer.parseInt(component));
            } else {
                int nbr1 = stack.pop();
                int nbr2 = stack.pop();
                switch (component) {
                    case "+" -> stack.push(nbr2 + nbr1);
                    case "-" -> stack.push(nbr2 - nbr1);
                    case "/" -> stack.push(nbr2 / nbr1);
                    case "*" -> stack.push(nbr2 * nbr1);
                    case "%" -> stack.push(nbr2 % nbr1);
                }
            }
        }
        return stack.pop();
    }
}
