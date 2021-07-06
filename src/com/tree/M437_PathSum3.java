package com.tree;
/*
7.5.21
437. Path Sum III
https://leetcode.com/problems/path-sum-iii/

 */
public class M437_PathSum3 {
    public int pathSum(TreeNode root, int targetSum) {

        if(root==null){
            return 0;
        }

        /**
         * need to count all the possible path
         * so need to consider root, root.left, root.right
         *
         *      count = root + root.left + root.right
         *
         *  recursive call main method with root's left subTree && root's right subTree
         *      pass in current root into helper method (include root)
         *
         *              1 recursive call: from root to left subTree && right subTree
         *              2 recursive call:  from root.left to its  left subTree  && right subTree
         *              3 recursive call:   from root.right to its left subTree && right subTree
         *
         *
         */

        int count = sumStartWithRoot(root,targetSum) + pathSum(root.left,targetSum )+ pathSum(root.right,targetSum);

        return count;
    }

    public int sumStartWithRoot(TreeNode root, int targetSum ){


        if(root==null){
            return 0;
        }

        int count =0;

        int newSum = targetSum-root.val;

        System.out.println("newSum = " + newSum);

        //targetSum is passed in by subtract from previous root's val
        //  if targetSum == root.val
        //      we fount a sum
        //      so increase count

        if(targetSum==root.val){
            count++;
        }

        //keep count
        count = count + sumStartWithRoot(root.left,newSum) + sumStartWithRoot(root.right,newSum);

        return count;

    }
}
