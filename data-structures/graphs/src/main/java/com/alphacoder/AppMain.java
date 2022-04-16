package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("***********AdjacencyMatrix**********************");
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

        System.out.println("***********AdjacencyMatrix**********************");

        System.out.println("***********AdjacencyList**********************");
        AdjacencyList graphList = new AdjacencyList(5, false);
        graphList.addEdge(0, 1);
        graphList.addEdge(0, 4);
        graphList.addEdge(1, 2);
        graphList.addEdge(1, 3);
        graphList.addEdge(1, 4);
        graphList.addEdge(2, 3);
        graphList.addEdge(3, 4);

        graphList.deleteEdge(0, 4);
        graphList.deleteEdge(1, 4);
        graphList.deleteEdge(1, 3);


        //adjacencyList bfs
        graphList.bfs(0);
        System.out.println();

        System.out.println("Shortest path: "+graphList.shortestPath(0,4));

        System.out.println("***********AdjacencyList**********************");
    }
}
