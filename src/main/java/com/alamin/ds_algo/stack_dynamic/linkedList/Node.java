package com.alamin.ds_algo.stack_dynamic.linkedList;

import lombok.Data;

@Data
public class Node<T> {

    private final T data;

    private Node<T> nextNode;

}
