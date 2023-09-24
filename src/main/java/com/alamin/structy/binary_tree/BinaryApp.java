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
        implementation.depthFirstValuesIterative(tree).forEach(v->{
            System.out.print(v + ", ");
        });
        System.out.println();
        implementation.breadthFirstValues(tree).forEach(v->{
            System.out.print(v + ", ");
        });

        System.out.println();
        System.out.println("*************************");
        Node<String> createdTree = implementation.createdTree(null, "A");
        createdTree = implementation.createdTree(createdTree, "B");
        createdTree = implementation.createdTree(createdTree, "C");
        createdTree = implementation.createdTree(createdTree, "D");
        createdTree = implementation.createdTree(createdTree, "E");
        createdTree = implementation.createdTree(createdTree, "F");
        createdTree = implementation.createdTree(createdTree, "G");
        createdTree = implementation.createdTree(createdTree, "H");

        implementation.depthFirstValuesIterative(createdTree).forEach(v->{
            System.out.print(v + ", ");
        });
        System.out.println();
        implementation.breadthFirstValues(createdTree).forEach(v->{
            System.out.print(v + ", ");
        });
        System.out.println();
        System.out.println("Tree Sum");
        BinaryTreeImplementation<Integer> implementationInteger = new BinaryTreeImplementation<>();

        Node<Integer> createBinaryTree = implementationInteger.createdTree(null, 10);
        createBinaryTree = implementationInteger.createdTree(createBinaryTree, 20);
        createBinaryTree = implementationInteger.createdTree(createBinaryTree, 30);
        createBinaryTree = implementationInteger.createdTree(createBinaryTree, 40);
        createBinaryTree = implementationInteger.createdTree(createBinaryTree, 50);
        createBinaryTree = implementationInteger.createdTree(createBinaryTree, 50);

        var treeSum = implementationInteger.treeSum(createBinaryTree);
        System.out.println(treeSum);
        System.out.println(implementationInteger.treeSumDfs(createBinaryTree));
        System.out.println(implementationInteger.treeSumBfs(createBinaryTree));

    }



}
