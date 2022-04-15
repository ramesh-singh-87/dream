package com.alphacoder;

public class AdjacencyMatrix {

    private int vertices;
    private int [][] matrix;

    public AdjacencyMatrix(int vertices){
        this.vertices= vertices;
        matrix= new int[vertices][vertices];
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

}
