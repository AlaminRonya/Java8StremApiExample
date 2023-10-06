package com.alamin.sdlc_pro.stack.arrays;

public class Stack<T> {
    private T[] data;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
    }
    public boolean isEmpty(){
        return this.top == -1;
    }
    public boolean isFull(){
        return this.top == capacity - 1;
    }
    public void push(T item){
        if (isFull()){
            throw new RuntimeException("Stack is full.");
        }
        this.data[++top] = item;
    }
    public T pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty.");
        }
        return this.data[top--];
    }
    public T peek(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty.");
        }
        return this.data[top];
    }
}
