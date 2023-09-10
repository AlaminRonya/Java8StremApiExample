package com.alamin.structy.linkedList;

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
}
