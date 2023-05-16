package com.alamin.ds_algo.vertex;

import lombok.Data;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;
//@Data
public class Vertex<T> {

    private final T data;

    private boolean visited;
    private List<Vertex<T>> neighbors;

    public Vertex(T data) {
        this.data = data;
        this.visited = false;
        neighbors = new LinkedList<>();
    }

    public T getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                ", visited=" + visited +
                '}';
    }

    //    @ToString.Exclude
//    private List<Vertex<T>> neighbors = new LinkedList<>();
}
