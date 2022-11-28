package com.alamin.graph;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }
    public void add(Integer data){
        Node newNode = new Node(data);
        Node currentHead = this.head;
        this.head = newNode;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }
}
