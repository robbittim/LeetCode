package com.tree;

public class E104_MaxDepthOfBinaryTree {

    /*
    6.30.21
    104. Maximum Depth of Binary Tree
    https://leetcode.com/problems/maximum-depth-of-binary-tree/
     */
    public int maxDepth(TreeNode root) {


        if(root == null){
            return 0;
        }


            int countLeft = maxDepth(root.left);


            int countRight =maxDepth(root.right);


        return Math.max(countLeft,countRight)+1;

    }

}
