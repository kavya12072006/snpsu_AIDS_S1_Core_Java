package com.snpsu.Graph;

import java.util.ArrayList;
import java.util.HashMap;

class Ggraph {

    HashMap<Integer, ArrayList<Integer>> adjList;

    Ggraph(int vertices) {
        adjList = new HashMap<>();

        for (int i = 0; i < vertices; i++) {
            adjList.put(i, new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    void printAdjList() {
        for (int vertex : adjList.keySet()) {
            System.out.print(vertex + " -> ");

            for (int neighbour : adjList.get(vertex)) {
                System.out.print(neighbour + " ");
            }

            System.out.println();
        }
    }
}

class DriverCode {
    public static void main(String[] args) {

        Ggraph g = new Ggraph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.printAdjList();
    }
}