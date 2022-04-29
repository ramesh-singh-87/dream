package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        SpecialStack stack= new SpecialStack();
        stack.push(18);
        stack.push(19);
        stack.push(29);
        stack.push(15);
        stack.push(16);

        System.out.println("Min: "+stack.min());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Min: "+stack.min());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Min: "+stack.min());
        System.out.println(stack.pop());
        System.out.println("Min: "+stack.min());

    }
}
