package com.alamin.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean isWeighted, boolean isDirected) {
        this.vertices = new ArrayList<>();
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
    }

    public Vertex addVertex(String data){
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }
    public void addEdge(Vertex v1, Vertex v2, Integer weight){
        if (!this.isWeighted){
            weight = null;
        }
        v1.addEdge(v2, weight);
        if (!this.isDirected){
            v2.addEdge(v1, weight);
        }
    }
    public void removeEdge(Vertex vertex1, Vertex vertex2){
        vertex1.removeEdge(vertex2);
        if (!this.isDirected){
            vertex2.removeEdge(vertex1);
        }
    }
    public void removeVertex(Vertex vertex){
        this.vertices.remove(vertex);
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public boolean isWeighted() {
        return isWeighted;
    }

    public boolean isDirected() {
        return isDirected;
    }
    public Vertex getVertexByValue(String value){
        for (Vertex v: this.vertices){
            if (v.getData() == value){
                return v;
            }
        }
        return null;
    }
    public void print(){
        for (Vertex v: this.vertices){
            v.print(isWeighted);
        }
    }

    public static void main(String[] args) {
        // Directed graph and weighted
        Graph busNetwork = new Graph(true, true);
        Vertex cliftonStation = busNetwork.addVertex("Clifton");
        Vertex capeMayStation = busNetwork.addVertex("Cape May");
        busNetwork.addEdge(cliftonStation, capeMayStation, 1000);
        busNetwork.print();

        // Undirected graph and weighted
        Graph busNetwork1 = new Graph(true, false);
        Vertex cliftonStation1 = busNetwork1.addVertex("Clifton");
        Vertex capeMayStation1 = busNetwork1.addVertex("Cape May");
        busNetwork1.addEdge(cliftonStation1, capeMayStation1, 1000);
        busNetwork1.print();
    }
}
