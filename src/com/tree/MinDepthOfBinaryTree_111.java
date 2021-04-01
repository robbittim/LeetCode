package com.tree;

import com.sun.scenario.effect.Brightpass;
/*
111. Minimum Depth of Binary Tree
https://leetcode.com/problems/minimum-depth-of-binary-tree/submissions/
 */
public class MinDepthOfBinaryTree_111 {

    public int minDepth(TreeNode root) {
        /* approach 1
        return countDepth(root);
    }

    public int countDepth (TreeNode tree){
        int countLeft = 0;
        int countRight = 0;
        if(tree ==null) return 0;

        if (tree.left != null){

            countLeft = countDepth(tree.left);
        }
        if (tree.right != null){

            countRight = countDepth(tree.right);
        }

        System.out.println("countLeft = " + countLeft);
        System.out.println("countRight = " + countRight);


        if(countLeft == 0 || countRight ==0){
            return 1+Math.max(countLeft,countRight) ;
        }

        return 1+Math.min(countLeft,countRight) ;
    }

         */

        // approach 2

        if (root == null) return 0;
        if (root.left == null) return minDepth(root.right) + 1;
        else if (root.right == null) return minDepth(root.left) + 1;

        //if both sub tree are not empty
        return Math.min(minDepth(root.right), minDepth(root.left)) + 1;

    }
}
