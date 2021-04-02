package com.tree;

import sun.reflect.generics.tree.Tree;

/*
112. Path Sum
https://leetcode.com/problems/path-sum/
 */
public class PathSum_112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        /*
     if(root==null) return false;
     if(root.left==null && root.right==null) return root.val==targetSum;

     int temp = targetSum-root.val;

     if(countValue(root,temp) == 1){
         return true;
     }else return false;

    }
    public int countValue (TreeNode root, int temp){
        if(root.left!=null) {
            if (temp > root.left.val) {
                temp = temp - countValue(root.left, temp);
                if (temp == 0) {
                    return 1;
                }
            }
        }
        if(root.right!=null) {
            if (temp > root.right.val) {
                temp = temp - countValue(root.right, temp);
                if (temp == 0) {
                    return 1;
                }
            }
        }
        return 0;
         */

        if(root==null) return false;
        if(root.left==null && root.right==null) {
            System.out.println("left tree and right tree are null");
            System.out.println("targetSum = " + targetSum);
            return root.val == targetSum;
        }
        int temp = targetSum-root.val;
        System.out.println("temp = "+ temp);
        return hasPathSum(root.left,temp) || hasPathSum(root.right,temp);

    }

}
