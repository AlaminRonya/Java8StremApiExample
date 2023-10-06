package com.alamin.sdlc_pro.stack.arrays;

public class Queue<T> {
    private T[] data;
    private int front;
    private int rear;
    private int capacity;
    public Queue(int capacity){
        this.capacity = capacity;
        this.front = -1;
        this.rear = -1;
        this.data = (T[]) new Object[this.capacity];
    }
    public boolean isEmpty(){
        return this.rear == -1;
    }
    public boolean isFull(){
        return this.rear == capacity - 1;
    }
    public void add(T value){
        if (isFull()){
            throw new RuntimeException("Queue is full");
        }
        if (this.front == -1){
            ++this.front;
        }
        this.data[++rear] = value;

    }
}
