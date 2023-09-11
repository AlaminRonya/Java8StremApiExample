package com.alamin.structy.linkedList;

import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {
//        Node<Integer> a = new Node<>(10);
//        Node<Integer> b = new Node<>(20);
//        Node<Integer> c = new Node<>(30);
//        Node<Integer> d = new Node<>(40);
//        a.setNext(b);
//        b.setNext(c);
//        c.setNext(d);
//        Node<Integer> root = a;
//
//        while (root != null){
//            System.out.println(root.getData());
//            root = root.getNext();
//        }
//        root = a;
//
//        while (root != null){
//            System.out.println(root.getData());
//            root = root.getNext();
//        }
        Node<Integer> root;
        LinkedListImplementation<Integer> implementation = new LinkedListImplementation<>();
        root = implementation.insertAtLast(10, null);
        root = implementation.insertAtLast(20, root);
        root = implementation.insertAtLast(30, root);
        root = implementation.insertAtLast(30, root);
        root = implementation.insertAtFirst(40, root);
        root = implementation.insertAtLast(40, root);
        root = implementation.deleteAtFirst( root);
        root = implementation.deleteAtPosition( root, 3);
//        root = implementation.insertAtFirst(40, root);
//        root = implementation.insertAtPosition(80, root,2);


//        Node<Integer> temp = root;
//        while (temp != null){
//            System.out.println(temp.getData());
//            temp = temp.getNext();
//        }

        implementation.displayIterator(root);
        implementation.displayRecursively(root);
        var listValues = implementation.linkedListValuesIterative(root);
        listValues.forEach(System.out::println);
        System.out.println("--------------");
        listValues = implementation.linkedListValuesRecursive(root);
        listValues.forEach(System.out::println);
        System.out.println("--------------");
        System.out.println(implementation.sumListIterative(root));
        System.out.println("--------------");
        System.out.println(implementation.sumListRecursive(root));
        System.out.println("--------------");
        System.out.println(implementation.linkedListFindIterative(root, 15));
        System.out.println("--------------");
        System.out.println(implementation.linkedListFindRecursive(root, 10));
        System.out.println("-----------------------");
        implementation.displayIterator(root);
        Node<Integer> reverseListIterative = implementation.reverseListIterative(root);
        implementation.displayIterator(reverseListIterative);
        reverseListIterative = implementation.reverseListRecursive(reverseListIterative);
        implementation.displayIterator(reverseListIterative);

        Node<Integer> node2 = null;
        node2 = implementation.insertAtLast(10, null);
        node2 = implementation.insertAtLast(20, node2);
        node2 = implementation.insertAtLast(30, node2);
        node2 = implementation.insertAtLast(40, node2);
        var zipper1 = implementation.zipperListsRecursive(root, node2);
        implementation.displayIterator(zipper1);


    }
}
