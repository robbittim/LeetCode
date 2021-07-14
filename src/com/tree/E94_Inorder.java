package com.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
7.10.21
94. Binary Tree Inorder Traversal
https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 */
public class E94_Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        /**
         * PreOrder  = Root -> Left -> Right
         * InOrder   = Left -> Root -> Right
         * PostOrder = Left -> Right -> Root
         **/
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root==null) return list;

        //create a node for current node, initial is root
        TreeNode curr = root;

        while(!stack.isEmpty() || curr!=null){
            while(curr!=null){

                stack.push(curr);

                //left traversal, get all the node from left subtree
                // and push all the left node into stack
                curr = curr.left;

            }
            //pop the last push node, which is the left most node
            // then pop the right node
            curr = stack.pop();
            // add the left most node value into the list
            //      then add the left node value into the list
            list.add(curr.val);

            System.out.println("root value = " + root.val);
            //since we traversed all the left node from 2nd while loop
            //      after we pop from stack
            //      current node is whatever the last node of the left node
            //          then we traverse the right node

            curr=curr.right;

        }
        System.out.println("list = " + list);
        return list;
    }
}
