package com.alphacoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AdjacencyList {
    private int vertices;
    private LinkedList<Integer>[] edges;
    private boolean isDirected;
    private int[] parents;

    public AdjacencyList(int vertices, boolean directed){
        this.vertices= vertices;
        edges= new LinkedList[vertices];
        this.isDirected= directed;
        this.parents= new int[vertices];
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

    /*
    Time complexity is O(V+M)
     */
    public void bfs(int start){
        Queue<Integer> queue= new LinkedList<>();
        boolean [] visited= new boolean[vertices];
        queue.offer(start);
        visited[start]= true;
        parents[start]= -1;

        while(!queue.isEmpty()){
            int val= queue.poll();
            System.out.print(val+ " ");
            LinkedList<Integer> list= edges[val];
            for(int i=0; i< list.size(); i++){
                if(!visited[list.get(i)]) {
                    queue.offer(list.get(i));
                    visited[list.get(i)]= true;
                    parents[list.get(i)]= val;
                }
            }
        }
    }

    public int shortestPath(int source, int destination){
        if(source== destination){
            return 0;
        }
        List<Integer> path= new ArrayList<>();
        int shortestPath= 1;
        path.add(0, destination);
        int temp= parents[destination];
        while(temp!= source){
            shortestPath++;
            if(temp!= source) {
                path.add(0, temp);
            }
            temp= parents[temp];
        }

        path.add(0, source);
        path.stream().forEach(i -> System.out.print(i+ " "));
        return shortestPath;
    }
}
