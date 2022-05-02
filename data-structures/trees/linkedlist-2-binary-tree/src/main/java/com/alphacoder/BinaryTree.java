package com.alphacoder;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node head;
    public TreeNode root;

    public void push(int data){
        Node node= new Node(data);
        node.next= head;
        head= node;
    }

    public TreeNode createBinaryTree(TreeNode root){
        if(head==null){
            return root;
        }

        Queue<TreeNode> queue= new LinkedList<>();
        root= new TreeNode(head.data);
        queue.offer(root);

        head= head.next;
        while(head!= null){
            TreeNode parent= queue.poll();
            parent.left= new TreeNode(head.data);
            queue.offer(parent.left);
            head= head.next;

            if(head!= null){
                parent.right= new TreeNode(head.data);
                queue.offer(parent.right);
                head= head.next;
            }

        }


        return root;
    }

    public void inOrder(TreeNode root){
        if(root!= null){
            inOrder(root.left);
            System.out.print(root.data+ " ");
            inOrder(root.right);
        }
    }
}
