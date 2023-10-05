package com.alamin.sdlc_pro.linkedlist;

public class App {
    public static void main(String[] args) {
        LinkedListImplement<Integer> linkedList = new LinkedListImplement<>();
        linkedList.insertFirst(30);
        linkedList.insertFirst(20);
        linkedList.insertFirst(10);
        linkedList.display();
    }
}
