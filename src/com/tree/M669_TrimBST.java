package com.tree;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;
/*
7.11.21
669. Trim a Binary Search Tree
https://leetcode.com/problems/trim-a-binary-search-tree/
 */
public class M669_TrimBST {
    public TreeNode trimBST(TreeNode root, int low, int high) {

        if(root ==null) return root;

        /**
         *   since root value is less than val
         *               based on principle, root's right tree is greater than root
         *                   so we recursive called main() with root's right subTree
         */

        if(root.val < low ) return trimBST(root.right, low, high);

        /**
         *   since root value is greater than val
         *               based on principle, root's left tree is less than root
         *                   so we recursive called main() with root's left subTree
         */

        if(root.val > high) return trimBST(root.left,low,high);

        /**
         *  since root's value is in the range of low and high
         *      we check it's left subTree and right subTree recursively
         *          in the new call, those subTree will be treated as root
         */

        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);

        return root;
    }
}
