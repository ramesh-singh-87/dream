package com.alphacoder;

public class LinkedList {
    private Node head;

    /*
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public void print(){
        Node temp= head;

        System.out.print("[ ");
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.print("]");
        System.out.println();
    }
    /*
    Time complexity: O(1)
    Space complexity: O(1)
     */
    public void push(int data){
        Node node= new Node(data);
        node.next= head;
        head= node;
    }




}
