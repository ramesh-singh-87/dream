package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        Queue queue= new Queue();
        queue.enQueue(4);
        queue.enQueue(3);
        queue.enQueue(6);
        queue.enQueue(9);
        queue.enQueue(1);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.isEmpty());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }

}
