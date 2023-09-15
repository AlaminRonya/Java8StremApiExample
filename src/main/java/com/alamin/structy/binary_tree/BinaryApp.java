package com.alamin.structy.binary_tree;

public class BinaryApp {
    public static void main(String[] args) {
        BinaryTreeImplementation<String> implementation = new BinaryTreeImplementation<>();
        Node<String> root = null;
        root = implementation.insert("A", null);
        root = implementation.insert("B", root);
        root = implementation.insert("C", root);
        root = implementation.insert("D", root);
        System.out.println(root);
        System.out.println(implementation.getTree());
        Node<String> tree = implementation.getTree();
        implementation.depthFirstValuesIterative(tree).forEach(System.out::println);


    }


}
