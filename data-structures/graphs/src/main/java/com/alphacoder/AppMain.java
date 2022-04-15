package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        AdjacencyMatrix graph = new AdjacencyMatrix(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
        graph.deleteEdge(0, 4);
        graph.deleteEdge(1, 4);
        graph.deleteEdge(1, 3);
        graph.printGraph();

        //adjacencyMatrix bfs
        graph.bfs(0);
        System.out.println();

        System.out.println("Shortest path: "+graph.shortestPath(0,4));
    }
}
