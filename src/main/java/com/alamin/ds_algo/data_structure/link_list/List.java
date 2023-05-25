package com.alamin.ds_algo.data_structure.link_list;

public interface List<T> {

    void insert(T data);

    void remove(T data);

    void removeRecursively(T data);

    void traverse();

    void traverseRecursively();

    boolean isEmpty();
}
