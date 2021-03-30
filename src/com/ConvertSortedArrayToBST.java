package com;

/*
108. Convert Sorted Array to Binary Search Tree
https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length == 0) return null;

        return helper(nums,0,nums.length-1);


    }

    public TreeNode helper (int[] nums, int left, int right){

        if(left > right) return null;

        int mid = left + (right-left) /2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = helper(nums,left,mid-1);
        node.right = helper(nums,mid+1,right);
        return node;



    }


}
