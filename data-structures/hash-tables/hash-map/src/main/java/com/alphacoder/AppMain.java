package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        HashMap table= new HashMap();
        System.out.println(table.exists(0));
        table.put(1, 1);
        System.out.println(table.exists(1));
        System.out.println(table.exists(2));

    }
}
