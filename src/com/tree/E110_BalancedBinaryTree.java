package com.tree;

/*
6.30.21
110. Balanced Binary Tree
https://leetcode.com/problems/balanced-binary-tree/
 */
public class E110_BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {


        int ans = helper(root);

        if(ans!=-1){
            return true;
        }else
            return false;

    }

    public int helper(TreeNode tree){
        int countLeft = 0;
        int countRight = 0;

        if(tree ==null) return 0;

         countLeft = helper(tree.left);

        countRight = helper(tree.right);

        if(countLeft>=0 && countRight>=0 && Math.abs(countLeft-countRight)<=1)
        {return Math.max(countLeft,countRight) + 1;}

        return -1; // mean the subTree is not balanced

    }

}
