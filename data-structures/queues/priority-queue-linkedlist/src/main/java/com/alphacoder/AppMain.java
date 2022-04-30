package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {

        PriorityQueue q= new PriorityQueue();
        q.enQueue(2, 6);
        q.enQueue(6, 7);
        q.enQueue(7, 2);
        q.enQueue(3, 5);


        System.out.println("Peek: "+q.peek());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}
