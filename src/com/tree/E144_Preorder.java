package com.tree;

import java.util.*;

/*
7.10.21
144. Binary Tree Preorder Traversal
https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class E144_Preorder {

    public List<Integer> preorderTraversal(TreeNode root) {

        /**
         * PreOrder  = Root -> Left -> Right
         * InOrder   = Left -> Root -> Right
         * PostOrder = Left -> Right -> Root
       **/

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null) return list;
        stack.push(root);

        while(!stack.isEmpty()){

            TreeNode node = stack.pop();

            // traverse right first
            //      since stack is LIFO, so left will be pop out first
            if(node.right!=null) {
                System.out.println("node right = " + node.right.val);
                stack.add(node.right);
            }

            if(node.left!=null){
                System.out.println("node left = " + node.left.val);
                stack.add(node.left);
            }

            list.add(node.val);

            System.out.println("node val =" + node.val);
        }


        System.out.println("list = " + list);
        return list;


    }



}
