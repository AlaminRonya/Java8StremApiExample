package com.alamin.structy.linkedList;

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
        root = implementation.insertAtFirst(40, root);
        root = implementation.insertAtLast(40, root);
        root = implementation.deleteAtFirst( root);
        root = implementation.deleteAtPosition( root, 3);
        root = implementation.insertAtFirst(40, root);
        root = implementation.insertAtPosition(80, root,2);

//        Node<Integer> temp = root;
//        while (temp != null){
//            System.out.println(temp.getData());
//            temp = temp.getNext();
//        }

        implementation.displayIterator(root);
        implementation.displayRecursively(root);
    }
}
