package com.tree;

public class E404_SumOfLeftLeaves {
/*
 7.6.21
404. Sum of Left Leaves
https://leetcode.com/problems/sum-of-left-leaves/description/
*/
    public int sumOfLeftLeaves(TreeNode root) {

        if(root ==null ) {
            return 0;

            // if the left node is not null
            // and the left node is the leaf node
            //      return the value of the left node + right subTree

        }else if(root.left!=null && root.left.left ==null && root.left.right==null){

            return root.left.val + sumOfLeftLeaves(root.right);

            // recursive call both subTree to find the left leaf node
        }else{

            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }



    }
}
