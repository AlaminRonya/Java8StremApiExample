package com.alamin.structy.linkedList;

public class LinkedList<T> {
    private Node head;
    private Node tail;
    private int size = 0;
    private class Node{
        private final T value;
        private Node next;
        public Node(T value) {
            this.value = value;
        }
        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(T val){
        Node node = new Node(val);
        node.next = this.head;
        if (this.tail == null){
            this.tail = this.head;
        }
        this.size += 1;
    }
    public void display(){
        Node temp = this.head;
        while (temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
    }
}
