package com.tree;

import java.util.Stack;

/*
7.13.21
235. Lowest Common Ancestor of a Binary Search Tree
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class E235_LowestCommonAncestorOfBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root ==null) return null;

        //traverse by node
        TreeNode node = root;

        while(node!=null){

            //get the value of the current node
            int parentVal = node.val;

            //if p and q value are greater than current node value
            //  base on BST, search node's right subTree
            if(p.val > parentVal  && q.val > parentVal){
                node = node.right;
            }
            //if p and q value are smaller than current node value
            //  base on BST, search node's left subTree
            else if(p.val<parentVal && q.val<parentVal){
                node= node.left;
            // since the current node value is in the range
                // return the node
            }else{
                return node;
            }

        }

    return null;

        /**
         * recursion
         */
        /*
       public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
    if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
    return root;
}
         */
    }
}
