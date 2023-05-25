package com.alamin.ds_algo.data_structure.link_list;

public class MainApp {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();

        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);

        linkedList.traverse();

        linkedList.remove(20);

        linkedList.traverseRecursively();

        System.out.println(linkedList.isEmpty());

    }
}
