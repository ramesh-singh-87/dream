package com.alphacoder;

import java.util.LinkedList;

public class AdjacencyList {
    private int vertices;
    private LinkedList<Integer>[] edges;
    private boolean isDirected;

    public AdjacencyList(int vertices, boolean directed){
        this.vertices= vertices;
        edges= new LinkedList[vertices];
        this.isDirected= directed;
    }

    /*
    Time complexity to add an edge is O(1).
     */
    public void addEdge(int source, int destination){
        edges[source]= addNode(edges[source], destination);
        if(!isDirected){
            edges[destination]= addNode(edges[destination], source);
        }
    }

    /*
    Adding node is of time complexity O(1) as we are adding to the head.
     */
    private LinkedList<Integer> addNode(LinkedList<Integer> list, int val){
        if(list== null){
            list= new LinkedList();
        }
        list.addFirst(val);
        return list;
    }
    /*
    Time complexity to delete an edge is proportional to degree of the vertex whose edge is to be deleted.
     */
    public void deleteEdge(int source, int destination){
        deleteNode(edges[source], destination);
        if(!isDirected){
            deleteNode(edges[destination], source);
        }
    }
    /*
    Time complexity to delete the node is is proportional to degree of the vertex.
     */
    private LinkedList<Integer> deleteNode(LinkedList<Integer> list, int val){
        for(int i=0; i< list.size(); i++){
            if(list.get(i)== val){
                list.remove(list.get(i));
                break;
            }
        }
        return list;
    }
}
