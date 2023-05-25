package com.alamin.ds_algo.data_structure.link_list;

public class Node <T>{
    private final T data;
    private Node<T> nextNode;
    public Node(T data) {
        this.data = data;
    }



    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
