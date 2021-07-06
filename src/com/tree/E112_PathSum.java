package com.tree;
/*
7.5.21
112. Path Sum
https://leetcode.com/problems/path-sum/
Time: O(n) , visit every node in the tree
 */
public class E112_PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root==null) {return false;}

        /**
         * current node is a leaf node
         * since in recursion targetSum is getting smaller by subtract current node's val
         *
         *          int temp = targetSum - root.val
         *
         * when we reach the lastNode(leaf), just check if the val of the node == temp(targetSum)
         *      root.val == tragetSum
         *           True  - leaf node's val is part of sum of the original targetSum
         *           False - the path sum from root to current leaf node is not equal to targetSum
         *
         *
         */
        if(root.left==null && root.right==null){

                boolean check =  root.val ==targetSum;

                return check;
        }

        System.out.println("root.val = " + root.val);

        //targetSum is getting smaller by subtract current node's val
        //when reach the leaf node, the temp should equal to leaf node's val
        int temp = targetSum -root.val;

        //recursive called to reach the end of the tree
        // then check if the last node is a leaf node
        boolean hasSum = hasPathSum(root.left,temp) || hasPathSum(root.right,temp);

        return hasSum;


    }



}
