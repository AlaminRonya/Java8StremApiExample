package com.alamin.sdlc_pro.stack.linked_list;

public class Stack<T> {
    private Node<T> head;
    private static class Node<T>{
        private final T value;
        private Node<T> next;
        private Node(T value) {
            this.value = value;
        }
    }
    public void push(T value){
        var temp = new Node<>(value);
        temp.next = this.head;
        this.head = temp;
    }
    public T pop(){
        if (this.head == null){
            throw new RuntimeException("Stack is Empty");
        }
        var value = this.head.value;
        var temp = this.head.next;
        this.head.next = null;
        this.head = temp;
        return value;
    }
    public T peek(){
        if (this.head == null){
            throw new RuntimeException("Stack is Empty");
        }
        return this.head.value;
    }
}
