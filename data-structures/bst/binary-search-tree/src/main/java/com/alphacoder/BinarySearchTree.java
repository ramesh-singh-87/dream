package com.alphacoder;

public class BinarySearchTree {
    private Node root;

    public Node insert(int data){
        root=insertRec(root, data);
        return root;
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



    public Node deleteRec(int data, Node root){
        if(root== null){
            return root;
        }

        if(data< root.data){
            root.left= deleteRec(data, root.left);
        }else if(data> root.data){
            root.right= deleteRec(data, root.right);
        }else{
            if(root.left== null && root.right== null){
                root= null;
            }
            else if(root.left==null){
                Node temp= root.right;
                root.right= null;
                root= temp;
            }else if(root.right==null){
                Node temp= root.left;
                root.left= null;
                root= temp;
            }else{
                Node temp= min(root.right);
                root.data= temp.data;
                root.right=deleteRec(temp.data, root.right);
            }
        }

        return root;
    }

    private Node min(Node root){
        while(root.left!= null){
            root= root.left;
        }

        return root;
    }
}
