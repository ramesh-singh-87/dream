package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        BinarySearchTree bst= new BinarySearchTree();
        bst.insert(3);
        bst.insert(7);
        bst.insert(8);
        bst.insert(2);
        bst.insert(0);
        bst.insert(1);

        bst.inOrder();
    }
}
