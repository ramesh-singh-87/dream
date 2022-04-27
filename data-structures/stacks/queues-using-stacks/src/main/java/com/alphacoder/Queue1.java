package com.alphacoder;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue1 {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    public Queue1(){
        stack1= new ArrayDeque<>();
        stack2= new ArrayDeque<>();
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }

    /*
    Time Complexity: O(1)
    Space Complexity: O(1)
     */
    public void enQueue(int data){
        stack1.push(data);
    }

    /*
    Time Complexity: O(n)
    Space Complexity: O(n)
     */

    public int deQueue(){
        if(stack1.isEmpty()){
            throw new StackOverflowError("Cannot de-queue. Queue is empty.");
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int data= stack2.pop();

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return data;
    }

}
