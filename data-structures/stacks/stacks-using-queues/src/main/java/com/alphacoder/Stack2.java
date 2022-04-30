package com.alphacoder;

import java.util.LinkedList;
import java.util.Queue;

public class Stack2 {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public Stack2(){
        q1= new LinkedList<>();
        q2= new LinkedList<>();
    }

    public void push(int data){
        q2.offer(data);

        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }

        Queue temp= q1;
        q1= q2;
        q2= temp;
    }

    public int pop(){
        if(q1.isEmpty()){
            throw new StackOverflowError("Cannot pop. Stack is empty.");
        }

        return q1.poll();
    }
}
