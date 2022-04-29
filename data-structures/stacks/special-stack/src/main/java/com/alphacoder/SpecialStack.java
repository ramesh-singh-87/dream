package com.alphacoder;

import java.util.ArrayDeque;
import java.util.Deque;

public class SpecialStack extends ArrayDeque<Integer> {
    private Deque<Integer> min;

    public SpecialStack(){
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
        if(data< y){
            min.push(data);
        }else{
            min.push(y);
        }
    }

    public Integer pop(){
        if(super.isEmpty()){
            throw new StackOverflowError("Cannot pop. Stack is empty.");
        }
        min.pop();
        return super.pop();
    }

    public Integer min(){
        if(min.isEmpty()){
            throw new StackOverflowError("Stack is empty.");
        }
        return min.peek();
    }
}
