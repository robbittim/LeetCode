package com.tree;

/*
7.1.21
543. Diameter of Binary Tree
https://leetcode.com/problems/diameter-of-binary-tree/description/
 */
public class E543_DiameterOfBinaryTree {

    int max =0;
    public int diameterOfBinaryTree(TreeNode root) {

        helper(root);
        return max;

    }

    public int helper(TreeNode tree){

        if(tree==null) return 0;

        int l = helper(tree.left);
        int r = helper(tree.right);

        // if the sum of current node's edge l and r is greater than current max
        // set max to l+r
        if(max<l+r){
            max = l+r;
        }

        return Math.max(l,r)+1;

    }

}
