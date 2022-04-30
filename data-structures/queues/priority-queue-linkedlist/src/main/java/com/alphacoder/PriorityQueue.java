package com.alphacoder;

public class PriorityQueue {
    private Node head;


    public void enQueue(int data, int priority){
        Node node= new Node(data, priority);

        if(head== null){
            head= node;
        }else if(head.priority< priority){
            node.next= head;
            head= node;
        }else{
            Node temp= head;
            while(temp.next!= null && temp.next.priority>= priority){
                temp= temp.next;
            }
            node.next=temp.next;
            temp.next= node;
        }
    }

    public int peek(){
        if(head== null){
            throw new RuntimeException("Queue is empty.");
        }

        return head.data;
    }

    public int deQueue(){
        if(head== null){
            throw new RuntimeException("Queue is empty.");
        }

        int data= head.data;
        head= head.next;

        return data;
    }
}
