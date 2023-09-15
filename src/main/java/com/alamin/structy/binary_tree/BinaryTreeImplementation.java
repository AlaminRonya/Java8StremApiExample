package com.alamin.structy.binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
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
}
