package com.tree;

/*
7.6.21
687. Longest Univalue Path
https://leetcode.com/problems/longest-univalue-path/
 */
public class M687_LongestUnivaluePath {

    int maxLength;

    public int longestUnivaluePath(TreeNode root) {

        if(root == null) return 0;

        //helper() check current node's value with previous node's value
        helper(root,root.val);

        System.out.println("max = " + maxLength);

        return maxLength;

    }

    public int helper(TreeNode root, Integer previousNodeValue){

        if(root == null) return 0;

        //get the length of the left path
        int l = helper(root.left,root.val);
        //get the length of the right path
        int r = helper(root.right,root.val);

        System.out.println("l = " + l);
        System.out.println("r = " + r);

        //compare current maxLength
        //if l and r are both not 0, means the root is the same as its left child and right child

        //because at line 49 we return the length of the left/right path
        //so from line 30 and 32, if their path is 0
        //      then the current node's value (left/right) is not the same as previous node's value
        maxLength = Math.max(maxLength, l+r);
        System.out.println("max = " + maxLength);

        // since we found the matching value for
        //      current node's value WITH previous node's value
        // then we need to whatever path is the longest
        if(root.val == previousNodeValue){
            return Math.max(l,r)+1;
        }


        return 0;

    }

}
