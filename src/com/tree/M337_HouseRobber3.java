package com.tree;

/*
7.6.21
337. House Robber III
https://leetcode.com/problems/house-robber-iii/description/
 */


public class M337_HouseRobber3 {
    int max ;
    public int rob(TreeNode root) {

        // use an array to store the value of rod and noRod
        // ans[0] is rod, ans[1] is noRod

        int [] answer = helper(root);

        return Math.max(answer[0],answer[1]);

    }

    public int[] helper(TreeNode root) {

        if (root == null) {
            return new int[] {0,0};
        }

        int[] left = helper(root.left);

        int[] right = helper(root.right);

        // rod case:  current root val + any value from noRod
        int rob = root.val + left[1] + right[1];

        // noRod case:

        // even we decide not rob the parent node, for left/right child node,
        // we can still choose rob or not rob.
        // (Does not mean you have to rob child if parent is not robbed)

        int noRob = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);

        // return the array of value rob[0] and noRob[1]
        return new int[] { rob, noRob};

    }




}
