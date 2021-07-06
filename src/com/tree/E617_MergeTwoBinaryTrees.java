package com.tree;

import java.util.ArrayList;
import java.util.List;

/*
7.5.21
617. Merge Two Binary Trees
https://leetcode.com/problems/merge-two-binary-trees/description/
 */
public class E617_MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        //if root1 is null, set root2's current node as child node of root1
        if(root1==null){
            return  root2;
        }
        if(root2==null){
            return root1;
        }

        //update current node's value
        root1.val = root1.val + root2.val;

        //recursive call both tree's left subTree and right subTree

        //construct root left subTree
        root1.left = mergeTrees(root1.left,root2.left);

        //construct root right subTree
        root1.right = mergeTrees(root1.right,root2.right);


        return root1;

}}
