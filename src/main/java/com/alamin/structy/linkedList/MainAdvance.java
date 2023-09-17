package com.alamin.structy.linkedList;

public class MainAdvance {
    public static void main(String[] args) {
        LinkedListImplementation<Integer> implementation = new LinkedListImplementation<>();
        Node<Integer> root = null;
        root = implementation.insertAtFirst(60, root);
        root = implementation.insertAtFirst(50, root);
        root = implementation.insertAtFirst(40, root);
        root = implementation.insertAtFirst(30, root);
        root = implementation.insertAtFirst(20, root);
        root = implementation.insertAtFirst(10, root);
        implementation.displayIterator(root);
        LinkedListAdvanceTopic<Integer> topic = new LinkedListAdvanceTopic<>();
        var oddEven = topic.OddEvenList(root);
        implementation.displayIterator(oddEven);

    }
}
