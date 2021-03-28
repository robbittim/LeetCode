package com;

/*
104. Maximum Depth of Binary Tree
https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaxDepthOfBinaryTree_104 {
    public int maxDepth(BinaryTreeNode_TreeNode.TreeNode root) {
        return countDepth(root);
    }

    public int countDepth (BinaryTreeNode_TreeNode.TreeNode tree){
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

        return 1+Math.max(countLeft,countRight) ;
    }


}
