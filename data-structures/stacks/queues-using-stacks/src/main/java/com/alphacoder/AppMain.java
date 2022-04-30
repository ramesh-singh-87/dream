package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        Queue queue= new Queue();
        queue.enQueue(4);
        queue.enQueue(3);
        queue.enQueue(6);
        queue.enQueue(9);
        queue.enQueue(1);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.deQueue());
        System.out.println(queue.isEmpty());
        //System.out.println(queue.deQueue());

        System.out.println("***********************");
        Queue queue1= new Queue();
        queue1.enQueue(4);
        queue1.enQueue(3);
        queue1.enQueue(6);
        queue1.enQueue(9);
        queue1.enQueue(1);

        System.out.println(queue1.deQueue());
        System.out.println(queue1.deQueue());
        System.out.println(queue1.deQueue());
        System.out.println(queue1.deQueue());
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.deQueue());
        System.out.println(queue1.isEmpty());
        //System.out.println(queue.deQueue());
    }

}
