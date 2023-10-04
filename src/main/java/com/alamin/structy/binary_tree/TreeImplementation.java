package com.alamin.structy.binary_tree;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TreeImplementation<T>{
    private Node<T> head;
    private int size;

    private static class Node<T>{
        private final T value;
        public Node<T> left;
        private Node<T> right;
        public Node(T value) {
            this.value = value;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void createdTree(T value) {
        if (this.head == null) {
            this.head = new Node<>(value);
            return;
        }
        List<T>  values = new ArrayList<>();
        Queue<Node<T>> queue = new ArrayDeque<>();
        Node<T> temp = this.head;
        queue.add(temp);
        while (!queue.isEmpty()) {
            Node<T> node = queue.remove();
            values.add(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node.left == null){
                node.left = new Node<>(value);
                break;
            }
            if (node.right == null){
                node.right = new Node<>(value);
                break;
            }
        }

    }

    public  List<T> dfs(Node<T> root) {
        List<T> values = new ArrayList<>();
        if (root == null) {
            return values;
        }
        values.add(root.value);
        values.addAll(dfs(root.left)); // left values
        values.addAll(dfs(root.right)); // right values
        return values;
    }

    public List<T> bfs(){
        Node<T> root = this.head;
        List<T> values = new ArrayList<>();
        if (root == null){
            return values;
        }

        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<T> node = queue.remove();
            values.add(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return values;

    }

}
