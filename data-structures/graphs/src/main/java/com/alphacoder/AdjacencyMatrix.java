package com.alphacoder;

import java.util.*;

public class AdjacencyMatrix {

    private int vertices;
    private int [][] matrix;
    private int [] parent;


    public AdjacencyMatrix(int vertices){
        this.vertices= vertices;
        matrix= new int[vertices][vertices];
        parent= new int[vertices];
    }

    /*
       Time complexity of adding an edge: O(1)
     */
    public void addEdge(int source, int destination){
        try {
            matrix[source][destination] = 1;
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Given vertices does not exists in graph.");
        }
    }

    /*
      Time complexity to delete an edge is O(1)
     */
      public void deleteEdge(int source, int destination){
          try{
              matrix[source][destination]= 0;
          }catch(ArrayIndexOutOfBoundsException ex){
              System.out.println("Given vertices does not exists in graph.");
          }
      }
    /*
      Time complexity is O(n2)
     */
    public void printGraph(){
        for(int i=0 ; i< vertices; i++){
            for(int j=0; j< vertices; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        for(int i=0; i< vertices; i++){
            System.out.println("Vertex "+ i + " is connected to: ");
            for(int j=0; j< vertices; j++){
                if(matrix[i][j]==1){
                    System.out.print(j+ " ");
                }
            }
            System.out.println();
        }
    }

    /*
    Time complexity: O(V2)
     */
    public void bfs(int start) {
        Queue<Integer> vertexQueue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        vertexQueue.offer(start);
        visited[start] = true;
        parent[start] = -1;

        while (!vertexQueue.isEmpty()) {
            int vertex = vertexQueue.poll();
            System.out.print(vertex + " ");
            for (int i = 0; i < vertices; i++) {
                if (matrix[vertex][i] == 1 && !visited[i]) {
                    vertexQueue.offer(i);
                    visited[i] = true;
                    parent[i] = vertex;
                }
            }
        }
    }

    public int shortestPath(int source, int destination){
        if(source== destination){
            return 0;
        }
        int shortestPath= 1;
        int temp= destination;
        List<Integer> path= new ArrayList<>();
        path.add(0, destination);
        while(parent[temp]!= source){
            shortestPath++;
            temp= parent[temp];
            if(temp!=source) {
                path.add(0, temp);
            }
        }
        path.add(0, source);
        path.stream().forEach(element -> System.out.print(element+ " "));

        return shortestPath;
    }


}
