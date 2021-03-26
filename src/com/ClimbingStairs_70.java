package com;

/*
70. Climbing Stairs
https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs_70 {
    public int climbStairs(int n) {

        // dp [0] is number of way to climb 0 stairs
        int[] dp = new int [n+1];

        dp[0] = 1;  // there is one way to climb 0 stair - just dont climb
        dp[1] = 1;  // there is one way to climb 1 stair

        // we already solve 0 and 1 stair, so we start from 2 stair,  and we want to include the n stairs
        // we only have two way to climb the stairs - ether climb 1 or 2 steps
        // so for dp[i] stars, we only can climb from dp[i-1] -> 1 step
        //                                         OR dp[i-2] -> 2 step
        for(int i =2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }


        return dp[n];

    }


}
