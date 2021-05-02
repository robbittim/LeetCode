package com.math;

import java.util.Arrays;

/*
628. Maximum Product of Three Numbers
https://leetcode.com/problems/maximum-product-of-three-numbers/
 */
public class ProductOfThreeNumber_628 {
    public int maximumProduct(int[] nums) {

        /**
         * using sort
         */

        if(nums.length==3) return nums[0]*nums[1]*nums[2];

        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);

        /**
         * --> 3 Positive Largest Numbers
         * --> 2 Negative largest Numbers * 1 Positive Largest Number
         */

/*
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE,

                min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max(max1 * max2 * max3, max1 * min1 * min2);

 */


    }
}
