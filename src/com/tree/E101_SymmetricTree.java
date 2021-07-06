package com.tree;

import sun.reflect.generics.tree.Tree;

/*
7.5.21
101. Symmetric Tree
https://leetcode.com/problems/symmetric-tree/description/
 */
public class E101_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {


        return check(root,root);

    }

    public boolean check (TreeNode root1, TreeNode root2) {

        //both empty, then its symmetric
        if(root1 == null && root2 == null)return true;

        if(root1 ==null || root2 == null) return  false;


        if(root1.val!=root2.val){
            return false;
        }

        //compare tree1 left subTree with tree2 right subTree
        //compare tree1 right subTree with tree2 left subTree
        return check(root1.left, root2.right) && check(root1.right,root2.left);



    }

}
