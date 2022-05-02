package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        BinarySearchTree bst= new BinarySearchTree();
        Node root= null;
        root= bst.insert(3);
        root= bst.insert(7);
        root= bst.insert(8);
        root= bst.insert(2);
        root= bst.insert(0);
        root= bst.insert(1);
        root= bst.insert(5);

        bst.inOrder();
        root= bst.deleteRec(7, root);

        System.out.println();
        bst.inOrder();
        root= bst.deleteRec(5, root);

        System.out.println();
        bst.inOrder();

        root= bst.deleteRec(8, root);

        System.out.println();
        bst.inOrder();
    }
}
