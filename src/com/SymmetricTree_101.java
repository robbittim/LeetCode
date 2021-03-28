package com;


/*
101. Symmetric Tree
https://leetcode.com/problems/symmetric-tree/
 */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class SymmetricTree_101 {
public boolean isSymmetric(BinaryTreeNode_TreeNode.TreeNode root) {

   return checkSymmetric(root,root); // make a copy of the tree
    }

    public boolean checkSymmetric(BinaryTreeNode_TreeNode.TreeNode t1, BinaryTreeNode_TreeNode.TreeNode t2){

    if(t1 == null && t2 ==null) return true;

    if(t1 == null || t2 ==null) return false;

            //want value of the current node is the same, then check symmetric conditions
    return (t1.val == t2.val) && checkSymmetric(t1.left,t2.right) && checkSymmetric(t1.right,t2.left);

    }

}
