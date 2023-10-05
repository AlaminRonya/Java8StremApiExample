package com.alamin.sdlc_pro.linkedlist;

public class LinkedListImplement<T> {
    private Node<T> head;
    private int size;

    private static class Node<T>{
        private final T value;
        private Node<T> next;
        private Node(T value) {
            this.value = value;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(T value){
        if (this.head == null){
            this.head = new Node<>(value);
            this.size += 1;
            return;
        }
        Node<T> temp = new Node<>(value);
        temp.next = this.head;
        this.head = temp;
        this.size += 1;
    }
    public void display(){
        Node<T> root = this.head;
        while (root != null){
            System.out.print("("+root.value+")==>");
            root = root.next;
        }
        System.out.println();
    }

}
