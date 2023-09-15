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
        var app = new BinaryApp();
        app.s(10);
        app.s();
        var app1 = new BinaryApp();
        app1.s();
        app.finalParameter(1000);

    }

    private int a;
    public final void s(int b){
        this.a = b;

    }
    public void s(){
       final int a=100;
    }


    public void finalParameter(final int a){
        System.out.println(a);
    }


}
