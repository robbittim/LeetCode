package com.greedy;

/*
6.28.21
53. Maximum Subarray
https://leetcode.com/problems/maximum-subarray/
 */
public class E53_MaximumSubarray {
    public int maxSubArray(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }

        int globalSum = nums[0];
        int localSum = nums[0];

        for(int i =0 ; i <nums.length;i++){

            /**
             * Also a DP question
             *
             *     compare current val nums[i] with localSum + current val nums[i]
             *
             *     nums = [-2,1,-3,4,-1,2,1,-5,4]
             *
             *     localSum = num[0] = -2
             *     i = 1; nums[i] = 1
             *
             *     localSum = Math.max(nums[i],localSum+nums[i]);
             *              => Math.max(1, -2+1) = 1
             *              => localSum added a negative number, it become smaller than nums[i]
             *              => we keep nums[i], and re-calculate sum from nums[i]
             *
             *    Space = O(1), Time = O(n)
             */

           localSum = Math.max(nums[i],localSum+nums[i]);

           if(localSum>globalSum){
               globalSum = localSum;
           }

        }

        System.out.println("localSum = " + localSum);
        return globalSum;
    }
}
