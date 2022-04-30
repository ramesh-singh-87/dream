package com.alphacoder;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue1 {
    private Deque<Integer> s1;
    private Deque<Integer> s2;

    public Queue1(){
        s1= new ArrayDeque<>();
        s2= new ArrayDeque<>();
    }

    public void enQueue(int data){
        s1.push(data);
    }

    public int pop(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int data= s2.pop();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return data;
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }
}
