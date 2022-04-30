package com.alphacoder;

public class Queue1 {
    private Node front;
    private Node rear;

    public void enqueue(int data){
        Node node= new Node(data);
        if(rear==null){
            rear= node;
            front= node;
            return;
        }

        rear.next= node;
        rear= node;
    }

    public int deQueue(){
        if(front== null){
            throw new RuntimeException("Cannot dequeue. Queue is empty.");
        }

        int data= front.data;
        front= front.next;
        if(front==null){
            rear= null;
        }

        return data;
    }

    public int front(){
        if(front== null){
            throw new RuntimeException("Queue is empty.");
        }
        return front.data;
    }

    public int rear(){
        if(rear== null){
            throw new RuntimeException("Queue is empty.");
        }
        return rear.data;
    }
}
