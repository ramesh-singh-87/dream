package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();

        list.print();
        list.push(4);
        list.push(3);
        list.push(8);
        list.push(1);

        list.print();

        list.append(12);
        list.append(54);
        list.append(5);

        list.print();

        Node node= list.findNode(12);
        list.insertAfter(34, node);
        list.print();

        Node lastNode= list.findNode(5);
        list.insertAfter(46, lastNode);
        list.print();

        Node firstNode= list.findNode(1);
        list.insertAfter(6, firstNode);
        list.print();

        list.delete(1);
        list.print();

        list.delete(34);
        list.print();

        list.delete(46);
        list.print();


    }
}
