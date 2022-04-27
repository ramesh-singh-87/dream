package com.alphacoder;

public class StackList {
    private Node head;

    public boolean isEmpty(){
        return head== null;
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

    /*
    Time complexity: O(1)
    Space complexity: O(1)
     */
    public int peek(){
        if(head== null){
            throw new StackOverflowError("Cannot peek. Stack is empty.");
        }
        return head.data;
    }

    /*
   Time complexity: O(1)
   Space complexity: O(1)
    */
    public int pop(){
        if(head== null){
            throw new StackOverflowError("Cannot pop. Stack is empty.");
        }
        int data= head.data;
        head= head.next;

        return data;
    }
}
