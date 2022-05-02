package com.alphacoder;

public class BinarySearchTree {
    private Node root;

    public void insert(int data){
        root=insertRec(root, data);
    }

    private Node insertRec(Node root, int data){
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


    public void inOrder(){
        inOrderRec(root);
    }

    private void inOrderRec(Node root){
        if(root== null){
            return;
        }
        inOrderRec(root.left);
        System.out.print(root.data+ " ");
        inOrderRec(root.right);
    }
}
