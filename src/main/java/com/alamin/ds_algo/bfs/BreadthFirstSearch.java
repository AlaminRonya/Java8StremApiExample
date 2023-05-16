package com.alamin.ds_algo.bfs;

import com.alamin.ds_algo.vertex.Vertex;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public record BreadthFirstSearch<T>(Vertex<T> startVertex) {

    public void traverse() {
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(startVertex);
        while (!queue.isEmpty()) {
            Vertex<T> current = queue.poll();
            if (!current.isVisited()) {
                current.setVisited(true);
//                System.out.print("Current queue: ");
//                for (Vertex<T> item: queue) {
//                    System.out.print(item.getData() + " ");
//                }
//                System.out.println();
                current.setVisited(true);
                System.out.println(current);
                queue.addAll(current.getNeighbors());

            }

//            System.out.print("Current queue: ");
//            for (Vertex<T> item: queue) {
//                System.out.print(item.getData() + " ");
//            }
//            Vertex<T> current = queue.remove();
//            queue.addAll(current.getNeighbors());
        }
        System.out.println();
    }

}
