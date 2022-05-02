package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        BinaryTree tree= new BinaryTree();
        tree.push(36); /* Last node of Linked List */
        tree.push(30);
        tree.push(25);
        tree.push(15);
        tree.push(12);
        tree.push(10); /* First node of Linked List */

        TreeNode root= tree.createBinaryTree(tree.root);
        tree.inOrder(root);
    }
}
