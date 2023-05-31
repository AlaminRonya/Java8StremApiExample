package com.alamin.ds_algo.stack_dynamic.linkedList;

public class Stack<T> {

    private int size;
    private Node<T> root;

    public Stack() { }

    public void push(T data) {
        Node<T> node = new Node<>(data);
        if (!isEmpty()) {
            node.setNextNode(root);
        }
        root = node;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T oldRootData = root.getData();
        root = root.getNextNode();
        size--;
        return oldRootData;
    }

    public T peek() {
        return !isEmpty() ? root.getData() : null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
