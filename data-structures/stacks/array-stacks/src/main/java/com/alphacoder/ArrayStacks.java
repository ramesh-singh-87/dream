package com.alphacoder;

public class ArrayStacks {
    private int [] arr;
    private int counter1=-1;
    private int counter2;

    public ArrayStacks(int n){
        arr= new int[n];
        counter2= n;
    }

    public void push1(int data){
        counter1++;
        if(counter1>=counter2){
            throw new StackOverflowError("Stack is full. No more push.");
        }
        arr[counter1]= data;

    }

    public void push2(int data){
        counter2--;
        if(counter1>=counter2){
            throw new StackOverflowError("Stack is full. No more push.");
        }
        arr[counter2]= data;

    }

    public int pop1(){
        if(counter1<0){
            throw new StackOverflowError("Stack is empty. No pops.");
        }
        int data= arr[counter1];
        counter1--;
        return data;
    }

    public int pop2(){
        if(counter2>= arr.length){
            throw new StackOverflowError("Stack is empty. No pops.");
        }
        int data= arr[counter2];
        counter2++;
        return data;
    }
}
