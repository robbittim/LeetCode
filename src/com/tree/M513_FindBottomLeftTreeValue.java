package com.tree;

import java.util.LinkedList;
import java.util.Queue;

/*
7.9.21
513. Find Bottom Left Tree Value
https://leetcode.com/problems/find-bottom-left-tree-value/
 */
public class M513_FindBottomLeftTreeValue {

    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){

                root = queue.remove();
                System.out.println("root value = " + root.val);

                //add right node first
                if(root.right!=null) {
                    queue.add(root.right);
                    System.out.println("node.right value = " + root.right.val);
                }

                //then add left node
                //      so left node will be pop at LAST
                //          the last left node got pop is the left most node
                if(root.left!=null) {
                    queue.add(root.left);
                    System.out.println("node.left value = " + root.left.val);
            }
        }

        return root.val;

    }
}
