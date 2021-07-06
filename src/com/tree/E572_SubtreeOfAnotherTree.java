package com.tree;

/*
7.5.21
572. Subtree of Another Tree
https://leetcode.com/problems/subtree-of-another-tree/
 */
public class E572_SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        //root is null, so there is no subRoot exist
        if(root == null) return false;

        //also need to check the root's root node's val with subRoot root node's val
        //so first call helper() with root and subRoot
        if(helper(root,subRoot)){
            return true;
        }

        //then call main() for root's left subTree and root's right subTree

        // || , since if we found subTree exist in left subTree or right subTree of root,
        // we dont need to visit the other half subTree of root
        return  isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

    }

    public boolean helper(TreeNode root, TreeNode subRoot){


        if(root == null && subRoot==null) return true;

        if(root==null || subRoot==null)return false;

        System.out.println("root = " +root.val);
        System.out.println("subRoot = " +subRoot.val);

        if(root.val != subRoot.val ){
           return false;
        }

        return helper(root.left,subRoot.left) && helper(root.right,subRoot.right);

    }



}
