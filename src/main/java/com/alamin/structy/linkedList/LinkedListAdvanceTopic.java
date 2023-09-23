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

    public Node<Integer> mergeTwo(Node<Integer> list1, Node<Integer> list2){
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        Node<Integer> curr = new Node<>(10);
        Node<Integer> head = curr;

        while (list1 != null && list2 != null){
            if (list1.getData() <= list2.getData()){
                curr.setNext(list1);
                curr = curr.getNext();
                list1 = list1.getNext();
            }else if (list1.getData() > list2.getData()){
                curr.setNext(list2);
                curr = curr.getNext();
                list2 = list2.getNext();
            }
        }

        if (list1 != null){
            curr.setNext(list1);
        }
        if (list2 != null){
            curr.setNext(list2);
        }

        return head.getNext();
    }


}
