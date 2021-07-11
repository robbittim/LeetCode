package com.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/*
7.10.21
145. Binary Tree Postorder Traversal
https://leetcode.com/problems/binary-tree-postorder-traversal/description/
 */
public class E145_Postorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        /**
         * PreOrder  = Root -> Left -> Right
         * InOrder   = Left -> Root -> Right
         * PostOrder = Left -> Right -> Root
         *
         * if we change PreOrder: Root -> Left -> Right to
         *                        Root -> Right -> Left
         *
         * reverse that order, we get PostOrder Left -> Right -> Root
         **/

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        if(root ==null) return list;

        stack.push(root);
        while(!stack.isEmpty()){

            TreeNode node = stack.pop();

            System.out.println("stack= " + stack.size() );

            //add root into list first, so after reverse it will be the last
            list.add(node.val);

            //Add left first
            if(node.left!=null) stack.push(node.left);
            //Add right last, since stack is LIFO, right will be pop first
            if(node.right !=null) stack.push(node.right);

            System.out.println("node value = " + node.val);

        }
        System.out.println("list = " + list );
        Collections.reverse(list);
        System.out.println("list reverse = " + list);
return list;
    }
}
