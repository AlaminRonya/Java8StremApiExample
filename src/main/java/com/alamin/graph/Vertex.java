package com.alamin.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String data;
    private List<Edge> edges;

    public Vertex(String data) {
        this.data = data;
        this.edges = new ArrayList<>();
    }
    public void addEdge(Vertex endV, Integer weight){
        this.edges.add(new Edge(this, endV, weight));
    }
    public void removeEdge(Vertex endV){
        this.edges.removeIf(edge -> edge.getEnd().equals(endV));
    }

    public String getData() {
        return data;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void print(boolean showWeight){
        String message = "";
        if (this.edges.size() == 0){
            System.out.println(this.data+"--->");
            return;
        }
        for (int i = 0; i < this.edges.size(); i++){
            if (i == 0){
                message += this.edges.get(i).getStart().data+"-->";
            }
            message += this.edges.get(i).getEnd().data;
            if (showWeight){
                message += "("+this.edges.get(i).getWeight()+")";

            }
            if (i != this.edges.size()-1){
                message += ",";
            }
        }
        System.out.println(message);
    }

}
