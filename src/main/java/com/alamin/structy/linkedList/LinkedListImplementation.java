package com.alamin.structy.linkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedListImplementation<T> {
    public Node<T> insertAtFirst(T data, Node<T> head){
        return new Node<>(data, head);
    }
    public Node<T> insertAtLast(T data, Node<T> head){
        if (head == null){
            return new Node<>(data);
        }
        Node<T> curr = head;
        while (curr.getNext() != null){
            curr = curr.getNext();
        }
        Node<T> newNode = new Node<>(data);
        curr.setNext(newNode);
        return head;
    }

    public Node<T> insertAtPosition(T data, Node<T> head, int pos){
        pos--;
        if (head == null || pos < 0){
            return head;
        }
        if (pos == 0){
            return new Node<>(data, head);
        }
        Node<T> prev = null;
        Node<T> curr = head;
        while (curr != null && pos != 0){
            prev = curr;
            curr = curr.getNext();
            pos--;
        }
        if (pos == 0){
            Node<T> newNode = new Node<>(data);
            prev.setNext(newNode);
            newNode.setNext(curr);
        }

        return head;
    }

    public Node<T> deleteAtFirst(Node<T> head){
        if (head == null || head.getNext() == null){
            return null;
        }
        Node<T> temp = head.getNext();
        head.setNext(null);
        return temp;
    }

    public Node<T> deleteAtLast(Node<T> head){
        if (head == null || head.getNext() == null) return null;
        Node<T> prev = head;
        Node<T> curr = head;
        while (curr.getNext() != null){
            prev = curr;
            curr = curr.getNext();
        }
        prev.setNext(null);

        return head;
    }
    public Node<T> deleteAtPosition(Node<T> head, int pos){
        pos--;
        if (head == null || pos < 0){
            return head;
        }

        if (pos == 0){
            Node<T> tNode = head.getNext();
            head.setNext(null);
            return tNode;
        }
        Node<T> prev = head;
        Node<T> curr = head;
        while (curr.getNext() != null && pos != 0){
            prev = curr;
            curr = curr.getNext();
            pos--;
        }
        if (pos == 0){
            prev.setNext(curr.getNext());
        }


        return head;
    }

    public void displayIterator(Node<T> head){

        while (head != null){
            System.out.print("("+head.getData()+")-->");
            head = head.getNext();
        }
        System.out.println("null");
    }
    public void displayRecursively(Node<T> head){

        if (head == null){
            System.out.println("null");
            return;
        }
        System.out.print("("+head.getData()+")-->");
        displayRecursively(head.getNext());
    }


    public List<T> linkedListValuesIterative(Node<T> head){
        List<T> values = new ArrayList<>();
        while (head != null){
            values.add(head.getData());
            head  = head.getNext();
        }
        return values;
    }
    /**
     * linkedListValuesIterative
     * n = size of linked list
     * Time: O(n)
     * Space: O(n)
     */
    public List<T> linkedListValuesRecursive(Node<T> head){
        List<T> values = new ArrayList<>();
        linkedListValuesRecursive(head, values);
        return values;
    }

    private void linkedListValuesRecursive(Node<T> head, List<T> values){
        if (head == null) {
            return;
        }
        values.add(head.getData());
        linkedListValuesRecursive(head.getNext(), values);
    }

    /**
     * linkedListValuesRecursive
     * n = size of linked list
     * Time: O(n)
     * Space: O(n)
     */

    public int sumListIterative(Node<T> head){
        try {
            int sum = 0;
            while (head != null){
                sum = sum + Integer.parseInt(String.valueOf(head.getData()));
                head  = head.getNext();
            }
            return sum;
        }catch (Exception e){
           e.printStackTrace();
        }

        return Integer.MIN_VALUE;
    }

    /**
     * sumListIterative
     * n = size of linked list
     * Time: O(n)
     * Space: O(1)
     */
    public int sumListRecursive(Node<T> head){
        try {
            if (head == null){
                return 0;
            }
            return Integer.parseInt(String.valueOf(head.getData())) + sumListRecursive(head.getNext());
        }catch (Exception e){
            e.printStackTrace();
        }

        return Integer.MIN_VALUE;
    }

    /**
     * sumListRecursive
     * n = size of linked list
     * Time: O(n)
     * Space: O(n)
     */

    public boolean linkedListFindIterative(Node<T> head, T target){
        Node<T> current = head;
        while (current != null) {
            if (target == current.getData()) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    /**
     * linkedListFindIterative
     * n = size of linked list
     * Time: O(n)
     * Space: O(1)
     */
    public boolean linkedListFindRecursive(Node<T> head, T target){
        if (head == null) {
            return false;
        }
        if (head.getData() == target) {
            return true;
        }
        return linkedListFindRecursive(head.getNext(), target);
    }
    /**
     * linkedListFindRecursive
     * n = size of linked list
     * Time: O(n)
     * Space: O(n)
     */

    public Node<T> reverseListIterative(Node<T> head) {
        Node<T> previous = null;
        Node<T> current = head;
        while (current != null) {
            Node<T> next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

    /**
     * reverseListIterative
     *  n = size of linked list
     * Time: O(n)
     * Space: O(1)
     */
    public Node<T> reverseListRecursive(Node<T> head) {
        return reverseListRecursive(head, null);
    }
    public Node<T> reverseListRecursive(Node<T> head, Node<T> prev) {
        if (head == null) {
            return prev;
        }
        Node<T> next = head.getNext();
        head.setNext(prev);
        return reverseListRecursive(next, head);
    }
    /**
     * reverseListRecursive
     * n = size of linked list
     * Time: O(n)
     * Space: O(n)
     */

    public Node<T> zipperListsIterative(Node<T> head1, Node<T> head2) {
        Node<T> head = head1;
        Node<T> tail = head;
        Node<T> current1 = head1.getNext();
        Node<T> current2 = head2;

        int count = 0;
        while (current1 != null && current2 != null) {
            if (count % 2 == 0) {
                tail.setNext(current2);
                current2 = current2.getNext();
            } else {
                tail.setNext(current1);
                current1 = current1.getNext();
            }
            tail = tail.getNext();
            count += 1;
        }

        if (current1 != null) {
            tail.setNext(current1);
        }
        if (current2 != null) {
            tail.setNext(current2);
        }

        return head;
    }
    /**
     * zipperListsIterative
     * n = size of linked list
     * Time: O(n)
     * Space: O(1)
     */

    public Node<T> zipperListsRecursive(Node<T> head1, Node<T> head2) {
        return zipperListsRecursive(head1, head2, 0);
    }
    private Node<T> zipperListsRecursive(Node<T> head1, Node<T> head2, int count) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        if (count % 2 == 0) {
            head1.setNext(zipperListsRecursive(head1.getNext(), head2, count + 1));
            return head1;
        } else {
            head2.setNext(zipperListsRecursive(head1, head2.getNext(), count + 1)); ;
            return head2;
        }
    }
    /**
     * zipperListsRecursive
     * n = size of linked list
     * Time: O(n)
     * Space: O(n)
     */
}
