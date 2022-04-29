package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        ArrayStacks stacks= new ArrayStacks(9);
        stacks.push1(3);
        stacks.push1(6);
        stacks.push1(4);
        stacks.push1(7);
        stacks.push1(8);
        stacks.push2(9);
        stacks.push2(0);
        stacks.push2(12);
        stacks.push2(34);
        //stacks.push2(65);

        System.out.println("Stack1: "+stacks.pop1());
        System.out.println("Stack1: "+stacks.pop1());
        System.out.println("Stack1: "+stacks.pop1());
        System.out.println("Stack1: "+stacks.pop1());
        System.out.println("Stack1: "+stacks.pop1());
        //System.out.println("Stack1: "+stacks.pop1());

        System.out.println("Stack2: "+stacks.pop2());
        System.out.println("Stack2: "+stacks.pop2());
        System.out.println("Stack2: "+stacks.pop2());
        System.out.println("Stack2: "+stacks.pop2());
        //System.out.println("Stack2: "+stacks.pop1());


    }
}
