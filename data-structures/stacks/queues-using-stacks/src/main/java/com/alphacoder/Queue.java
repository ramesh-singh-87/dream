package com.alphacoder;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    public Queue(){
        stack1= new ArrayDeque<>();
        stack2= new ArrayDeque<>();
    }

    /*
    Time Complexity: O(n)
    Space Complexity: O(n)
     */
    public void enQueue(int data){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }

    /*
    Time Complexity: O(1)
    Space Complexity: O(1)
     */
    public int deQueue(){
        if(stack1.isEmpty()){
            throw new StackOverflowError("Cannot pop. Stack is empty.");
        }

        return stack1.pop();
    }

    /*
   Time Complexity: O(1)
   Space Complexity: O(1)
    */
    public int peek(){

        if(stack1.isEmpty()){
            throw new StackOverflowError("Cannot peek. Stack is empty.");
        }

        return stack1.peek();
    }


}
