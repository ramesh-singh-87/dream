package com.alphacoder;

import java.util.ArrayDeque;
import java.util.Deque;

public class SpecialStackV2 extends ArrayDeque<Integer>{
    private Deque<Integer> min;

    public SpecialStackV2(){
        min= new ArrayDeque<>();
    }

    public void push(int data){
        if(super.isEmpty()){
            super.push(data);
            min.push(data);
            return;
        }

        super.push(data);
        int y= min.peek();
        if(data<= y){
            min.push(data);
        }
    }

    public Integer pop(){
        if(super.isEmpty()){
            throw new StackOverflowError("Cannot pop. Stack is empty.");
        }
        int res= super.pop();
        if(res==min.peek()){
            min.pop();
        }

        return res;
    }

    public Integer min(){
        if(min.isEmpty()){
            throw new StackOverflowError("Stack is empty.");
        }
        return min.peek();
    }
}

