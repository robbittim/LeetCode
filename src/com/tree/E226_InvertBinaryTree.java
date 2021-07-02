package com.tree;


/*
7.1.21
226. Invert Binary Tree
https://leetcode.com/problems/invert-binary-tree/
 */
public class E226_InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        /*
        if(root ==null)return null;

        //create a temp node to keep the root's left subtree
        TreeNode left = root.left;

        //root's left subtree is not root's right subtree
        root.left = invertTree(root.right);

        //root's right subtree is now the temp node (root's left subtree)
        root.right = invertTree(left);


        return root;

         */

        if(root ==null)return null;

        //get the farest left node
        TreeNode left = invertTree(root.left);
        //get the farest right node
        TreeNode right = invertTree(root.right);

        //swap
        root.left = right;
        root.right = left;

        return root;

    }

}
