package com.alphacoder;

public class Stack {
    private int top;
    private int size;
    private int [] arr;

    public Stack(){
        top= -1;
        size= 5;
        arr= new int[size];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    /*
    Time Complexity: O(1)
    Space Complexity: O(1)
     */
    public void push(int data){
        if(top==size-1){
            throw new StackOverflowError("Cannot push. stack is full.");
        }
        top++;
        arr[top]= data;
    }

    public int pop(){
        if(top==-1){
            throw new StackOverflowError("Cannot pop. Stack is empty.");
        }
        int res= arr[top];
        top--;
        return res;
    }

    public int peek(){
        if(top==-1){
            throw new StackOverflowError("Cannot peek. Stack is empty.");
        }

        return arr[top];
    }
}
