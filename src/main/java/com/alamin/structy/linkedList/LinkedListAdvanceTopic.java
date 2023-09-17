package com.alamin.structy.linkedList;

public class LinkedListAdvanceTopic<T> {

    public Node<T> OddEvenList(Node<T> head){
        if (head == null || head.getNext() == null){
            return head;
        }
        var evenList = head.getNext();
        var curOdd = head;
        var curEven = evenList;
        while (curOdd.getNext() != null && curEven.getNext() != null){
            curOdd.setNext(curEven.getNext());
            curOdd = curOdd.getNext();
            curEven.setNext(curOdd.getNext());
            curEven = curEven.getNext();
        }
        curOdd.setNext(evenList);
        return head;
    }

    public Node<T> IntersectionOfTwoLinkedLists(Node<T> nodeA, Node<T> nodeB){
        if (nodeA == null || nodeB == null){
            return null;
        }
        Node<T> A = nodeA;
        Node<T> B = nodeB;
        while (A != B){
            A = (A == null) ? nodeB : A.getNext();
            B = (B == null) ? nodeA : B.getNext();
        }
        return A;
    }


}
