package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        Stack1 s1= new Stack1();

        s1.push(2);
        s1.push(7);
        s1.push(0);
        s1.push(9);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        //System.out.println(s1.pop());

    }
}
