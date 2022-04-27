package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        Stack stack= new Stack();
        System.out.println(stack.isEmpty());

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(2);
        stack.push(0);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}
