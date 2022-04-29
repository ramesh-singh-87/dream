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
        //System.out.println("Min: "+stack.min());

        SpecialStackV2 stack2= new SpecialStackV2();
        stack2.push(18);
        stack2.push(19);
        stack2.push(29);
        stack2.push(15);
        stack2.push(16);

        System.out.println("Min: "+stack2.min());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println("Min: "+stack2.min());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println("Min: "+stack2.min());
        System.out.println(stack2.pop());
        //System.out.println("Min: "+stack2.min());

    }
}
