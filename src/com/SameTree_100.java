package com;

/*
100. Same Tree

https://leetcode.com/problems/same-tree/


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

public class SameTree_100 {
    public boolean isSameTree(TreeNode.TreeNode p, TreeNode.TreeNode  q) {

        //p.val is the value of the parent

        /*
         use recursion. Check if p and q nodes are not None, and their values are equal.
         If all checks are OK, do the same for the child nodes recursively.
         */

        System.out.println(p.val);

        if(p == null && q == null) return true; // both null return true, because they are the same

        if(p==null || q==null) return false; //one of the tree is null, return false

        if(p.val != q.val) return false; // the parent value of the tree are not the same

        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);



    }

}
