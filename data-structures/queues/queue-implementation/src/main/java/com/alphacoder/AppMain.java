package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        Queue q1= new Queue(5);
        q1.enqueue(5);
        q1.enqueue(9);
        System.out.println(q1.deQueue());
        System.out.println(q1.deQueue());
        //System.out.println(q1.deQueue());
        q1.enqueue(8);
        q1.enqueue(10);
        q1.enqueue(9);
        q1.enqueue(12);
        System.out.println("Front: "+q1.front());
        System.out.println("Rear: "+ q1.rear());


        System.out.println("******************");
        Queue1 q2= new Queue1();
        q2.enqueue(5);
        q2.enqueue(9);
        System.out.println(q2.deQueue());
        System.out.println(q2.deQueue());
        //System.out.println(q2.deQueue());
        q2.enqueue(8);
        q2.enqueue(10);
        q2.enqueue(9);
        q2.enqueue(12);
        System.out.println("Front: "+q2.front());
        System.out.println("Rear: "+ q2.rear());
    }
}
