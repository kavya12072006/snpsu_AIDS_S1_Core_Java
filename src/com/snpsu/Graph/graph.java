package com.snpsu.Graph;

public class graph {
    int v;
    int[][] adjmatrix;

    graph(int vertices) {
        this.v = vertices;
        adjmatrix = new int[v][v];
    }

    void addedge(int u, int v) {
        adjmatrix[u][v] = 1;
        adjmatrix[v][u] = 1;
    }

    void printadjmat() {
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(adjmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class drivercode {
    public static void main(String[] args) {
        graph g = new graph(3);

        g.addedge(0, 1);
        g.addedge(1, 2);
        g.addedge(0, 2);

        g.printadjmat();
    }
}