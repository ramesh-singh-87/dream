package com.alphacoder;

import java.util.LinkedList;
import java.util.Queue;

public class Stack1 {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public Stack1(){
        q1= new LinkedList<>();
        q2= new LinkedList<>();
    }

    public void push(int data){
        q1.offer(data);
    }

    public int pop(){
        if(q1.isEmpty()){
            throw new StackOverflowError("Cannot pop. Stack is empty.");
        }
        while(q1.size()!= 1){
            q2.offer(q1.poll());
        }
        int data= q1.poll();

        Queue temp= q1;
        q1= q2;
        q2= temp;
        return data;
    }
}
