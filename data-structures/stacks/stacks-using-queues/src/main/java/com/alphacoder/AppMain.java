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

        Stack2 s2= new Stack2();
        s2.push(2);
        s2.push(7);
        s2.push(0);
        s2.push(9);
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        //System.out.println(s2.pop());

    }
}
