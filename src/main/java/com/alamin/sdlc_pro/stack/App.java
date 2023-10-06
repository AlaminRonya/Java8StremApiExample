package com.alamin.sdlc_pro.stack;

import com.alamin.sdlc_pro.stack.arrays.Stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        System.out.println("***************************");
        com.alamin.sdlc_pro.stack.linked_list.Stack<Integer> linkedListStack = new com.alamin.sdlc_pro.stack.linked_list.Stack<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.peek());
        System.out.println(linkedListStack.pop());
    }
}
