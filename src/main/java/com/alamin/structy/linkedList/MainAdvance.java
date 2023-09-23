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
        Node<Integer> list1 = null;
        list1 = implementation.insertAtFirst(60, null);
        list1 = implementation.insertAtFirst(50, list1);
        list1 = implementation.insertAtFirst(40, list1);
        list1 = implementation.insertAtFirst(30, list1);
        list1 = implementation.insertAtFirst(20, list1);
        list1 = implementation.insertAtFirst(10, list1);
        Node<Integer> list2 = null;
        list2 = implementation.insertAtFirst(60, null);
        list2 = implementation.insertAtFirst(50, list2);
        list2 = implementation.insertAtFirst(40, list2);
        list2 = implementation.insertAtFirst(30, list2);
        list2 = implementation.insertAtFirst(20, list2);
        list2 = implementation.insertAtFirst(10, list2);

        Node<Integer> mergeTwo = topic.mergeTwo(list1, list2);
        implementation.displayIterator(mergeTwo);

    }
}
