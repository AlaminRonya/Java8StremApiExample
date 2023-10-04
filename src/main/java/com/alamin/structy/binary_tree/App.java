package com.alamin.structy.binary_tree;

import java.util.List;

public class App {
    public static void main(String[] args) {
        TreeImplementation<Integer> treeImplementation = new TreeImplementation<>();
        treeImplementation.createdTree(1);
        treeImplementation.createdTree(2);
        treeImplementation.createdTree(3);
        treeImplementation.createdTree(4);
        treeImplementation.createdTree(5);
        treeImplementation.createdTree(6);
        treeImplementation.createdTree(7);
        treeImplementation.createdTree(8);

        List<Integer> dfs = treeImplementation.dfs(treeImplementation.getHead());
        System.out.println(dfs);

        List<Integer> bfs = treeImplementation.bfs();

        System.out.println(bfs);

    }
}
