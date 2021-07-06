package com.tree;


/*
7.5.21
111. Minimum Depth of Binary Tree
https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 */
public class E111_MinDepthOfBinaryTree {
    public int minDepth(TreeNode root) {

        if(root==null) return 0;

        int l = minDepth(root.left);

        int r = minDepth(root.right);

        //if neither one of the subTree is empty
        //return sum of both path
       if(l==0 || r==0) return l+r+1;

        System.out.println("l = " + l);
        System.out.println("r = " + r);



        return Math.min(l,r)+1;



    }
}
