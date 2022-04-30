package com.alphacoder;

public class PriorityQueue {
    private Node [] arr;
    private int size;

    public PriorityQueue(){
        arr= new Node[10];
    }

    public void enQueue(Node node){
        arr[size]= node;
        size++;
    }

    public int peek(){
        int ind= 0;
        for(int i=0; i< size; i++){
            if(arr[i].priority== arr[ind].priority){
                if(arr[i].data>= arr[ind].data){
                    ind= i;
                }
            }else{
                if(arr[i].priority> arr[ind].priority){
                    ind= i;
                }
            }
        }

        return arr[ind].data;
    }

}
