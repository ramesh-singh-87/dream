package com.alphacoder;

import javax.naming.OperationNotSupportedException;

public class Queue {
    private int [] arr;
    private int size;
    private int capacity;
    private int front;
    private int rear;

    public Queue(int capacity){
        this.capacity= capacity;
        arr= new int[capacity];
        front= 0;
        size= 0;
        rear= capacity-1;
    }

    public void enqueue(int data){
        if(size==capacity){
            throw new RuntimeException("Cannot enqueue. Queue is full.");
        }

        rear= (rear+1)% capacity;
        size++;
        arr[rear]= data;
    }

    public int deQueue(){
        if(size==0){
            throw new RuntimeException("Cannot dequeue. Queue is empty.");
        }
        int data= arr[front];
        size--;
        front= (front+1)%capacity;

        return data;
    }

    public int front(){
        if(size==0){
            throw new RuntimeException("Queue is empty.");
        }
        return arr[front];
    }

    public int rear(){
        if(size==0){
            throw new RuntimeException("Queue is empty.");
        }
        return arr[rear];
    }
}
