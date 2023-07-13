package com.alamin.ds_algo.linkedlist;
public class Root {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertLast(10);
        linkedList.insertAtPosition(10,2);
        linkedList.show();
        System.out.println(linkedList.getSize());
    }
}
