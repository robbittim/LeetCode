package com.tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/*
7.12.21
230. Kth Smallest Element in a BST
https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 */
public class M230_KthSmallestElementInBST {
    /**
     * Using inOrder
     */
    private int count = 0;
    private int val;

    public int kthSmallest(TreeNode root, int k) {

        /**
         * Stored all the element in the list, sort and remove dup
         *      then loop through the list with k
         *          return list kth element
         */

        /*
        if(root ==null )return 0;

        Stack<TreeNode> stack = new Stack<>();

        List<Integer> list = new ArrayList<>();

        stack.add(root);

        while(!stack.empty()){

            TreeNode node = stack.pop();

            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);


            list.add(node.val);

        }

        Collections.sort(list);

        List<Integer> listWithoutDup = list.stream().distinct().collect(Collectors.toList());


        System.out.println("list = " + listWithoutDup);

        return list.get(k-1);


        return 0;

    }
         */

        /**
         * Using inOrder
         */
        inOrder(root, k);
        return val;
    }

    private void inOrder(TreeNode root,Integer k){
            if(root ==null ) return ;

            inOrder(root.left,k);
            count ++;
            //when the count is equal to k
            // we found the kth smallest element
            if(count == k){
                val = root.val;
                return;
        }
            inOrder(root.right,k);
    }
}
