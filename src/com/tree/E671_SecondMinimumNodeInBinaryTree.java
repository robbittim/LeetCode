package com.tree;

import java.util.*;
import java.util.stream.Collectors;

/*
7.7.21
671. Second Minimum Node In a Binary Tree
https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 */
public class E671_SecondMinimumNodeInBinaryTree {
    Set<Integer> set = new HashSet<Integer>();
    public int findSecondMinimumValue(TreeNode root) {

        //call helper() to get all the values in the tree
        //      and add those into set()
        int value = getVal(root);

        //rootValue is the 1st element in set
        int rootValue = root.val;
        long secondMin = Long.MAX_VALUE;

        for (int i : set) {
            // if current i is greater than 1st value in the set
            //      and secondMin is greater than i
            //          then current i is the 2nd min value
            if (rootValue < i && i < secondMin) secondMin = i;
        }

        System.out.println("rootValue = " + rootValue);
        System.out.println("secondMin = " + secondMin);
        System.out.println("set = " + set);
        //handle case that all the value in set are the same
        //if secondValue is equal to Long.MAX_VALUE
        //      which means secondMin never get updates, so return -1
         return secondMin < Long.MAX_VALUE ? (int) secondMin : -1;
    }

    public int getVal(TreeNode root){

        if(root ==null) {
            return 0;
        }

        getVal(root.left);
        getVal(root.right);
        set.add(root.val);
        return root.val;


    }
}
