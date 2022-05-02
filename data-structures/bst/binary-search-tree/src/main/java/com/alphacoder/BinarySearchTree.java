package com.alphacoder;

public class BinarySearchTree {
    private Node root;

    public void insert(int data){

    }

    public Node insertRec(Node root, int data){
        if(root==null){
            root= new Node(data);
            return root;
        }

        if(data< root.data){
            root.left= insertRec(root.left, data);
        }else{
            root.right= insertRec(root.right, data);
        }

        return root;
    }

    public void inOrder(Node root){
        if(root== null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+ " ");
        inOrder(root.right);
    }
}
