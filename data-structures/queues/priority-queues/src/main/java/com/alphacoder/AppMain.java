package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        Node node1= new Node(2, 6);
        Node node2= new Node(6, 7);
        Node node3= new Node(7, 6);
        Node node4= new Node(3, 5);

        PriorityQueue q= new PriorityQueue();
        q.enQueue(node1);
        // q.enQueue(node2);
        q.enQueue(node3);
        q.enQueue(node4);

        System.out.println(q.peek());
    }
}
