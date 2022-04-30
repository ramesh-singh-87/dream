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

    public int deQueue(){
        int data= peek();
        int index= find(data);

        for(int i= index; i<size-1; i++){
            arr[i]= arr[i+1];
        }
        size--;

        return data;
    }

    public int find(int data){
        for(int i=0; i< size; i++){
            if(arr[i].data== data){
                return i;
            }
        }
        return 0;
    }

}
