package com.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*
7.13.21
538. Convert BST to Greater Tree
https://leetcode.com/problems/convert-bst-to-greater-tree/
 */
public class M538_ConvertBSTToGreaterTree {
    int sum ;
    public TreeNode convertBST(TreeNode root) {
        /**
         * Get the right most node
         * use a sum that sum up value from right most node value
         * then set the curr node value to sum
         */
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;

        while(!stack.isEmpty() || curr!=null){

            //get the most right node:
            //push all nodes up to (and including) this subtree's maximum (right subTree) on the stack.
            while(curr!=null){
                stack.push(curr);
                curr= curr.right;
            }

            curr = stack.pop();

            //sum from the most right value
            sum = sum + curr.val;
            //set the current value to sum
            curr.val = sum;

            System.out.println("sum = " + sum);

            curr = curr.left;


        }
        return root;

        /**
         * using recursion
         */

        /*

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }

         */
    }
}
