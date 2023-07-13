package com.alamin.ds_algo.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = this.head;
        this.head = node;
        if (this.tail == null){
            this.tail = this.head;
        }
        this.size += 1;
    }
    public void insertLast(int value){
        if (this.tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        this.tail.next = node;
        this.tail = node;
        this.size += 1;
    }

    public void insertAtPosition(int value, int key){
        if (key < 1 || key > this.size){
            return;
        }
        if (key == 1){
            insertFirst(value);
            return;
        }
        if (key == this.size){
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node temp = this.head;
        Node prev = null;
        for (int i = 0; i < key; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = node;
        node.next = temp;
        this.size += 1;

    }

    public void show(){
        Node temp = this.head;
        while (temp != null){
            System.out.print(temp.value+"-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
