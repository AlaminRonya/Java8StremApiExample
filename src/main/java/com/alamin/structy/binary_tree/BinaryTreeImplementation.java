package com.alamin.structy.binary_tree;

import java.util.*;

public class BinaryTreeImplementation<T extends Comparable<T>> {
    public Node<T> insert(T data, Node<T> root) {
        if (root == null) {
            return new Node<>(data);
        }

        int comparisonResult = data.compareTo(root.getData());

        if (comparisonResult < 0) {
            root.setLeft(insert(data, root.getLeft()));
        } else if (comparisonResult > 0) {
            root.setRight(insert(data, root.getRight()));
        }

        return root;
    }

    public Node<String> getTree(){
        Node<String> a = new Node<>("A");
        Node<String> b = new Node<>("B");
        Node<String> c = new Node<>("C");
        Node<String> d = new Node<>("D");
        Node<String> e = new Node<>("E");
        Node<String> f = new Node<>("F");
        a.setLeft(b);
        a.setRight(c);
        a.getLeft().setLeft(d);
        a.getLeft().setRight(e);
        a.getRight().setRight(f);
        return a;
    }
    public  List<T> depthFirstValuesIterative(Node<T> root) {
        if (root == null) {
            return List.of();
        }
        List<T> values = new ArrayList<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node<T> node = stack.pop();
            values.add(node.getData());

            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
        }
        return values;
    }
    public  List<T> depthFirstValuesRecursive(Node<T> root) {
        if (root == null) {
            return List.of();
        }

        List<T> values = new ArrayList<>();
        values.add(root.getData());
        values.addAll(depthFirstValuesRecursive(root.getLeft())); // left values
        values.addAll(depthFirstValuesRecursive(root.getRight())); // right values
        return values;
    }

    public List<T> breadthFirstValues(Node<T> root) {
        if (root == null) {
            return List.of();
        }
        List<T> values = new ArrayList<>();
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<T> node = queue.remove();
            values.add(node.getData());
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
        return values;
    }

    public Node<T> createdTree(Node<T> root, T value) {
        if (root == null) {
            return new Node<>(value);
        }
        List<T> values = new ArrayList<>();
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<T> node = queue.remove();
            values.add(node.getData());
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
            if (node.getLeft() == null){
                node.setLeft(new Node<>(value));
                break;
            }
            if (node.getRight() == null){
                node.setRight(new Node<>(value));
                break;
            }
        }
        return root;
    }

    public int treeSum(Node<Integer> root){
        if (root == null){
            return 0;
        }
        return root.getData() + treeSum(root.getLeft()) + treeSum(root.getRight());
    }
    public int treeSumDfs(Node<Integer> root){
        if (root == null){
            return 0;
        }

        Stack<Node<Integer>> stack = new Stack<>();
        stack.push(root);
        int sum = 0;

        while (!stack.empty()) {
            Node<Integer> node = stack.pop();
            sum += node.getData();

            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
        }
        return sum;
    }
    public int treeSumBfs(Node<Integer> root){
        return sumBfs(root);
    }
    private int sumBfs(Node<Integer> root){
        if (root == null) {
            return 0;
        }
        Queue<Node<Integer>> queue = new ArrayDeque<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            Node<Integer> node = queue.remove();
            sum += node.getData();
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
        return sum;
    }

}
