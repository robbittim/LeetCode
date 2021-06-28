package com.greedy;


/*
6.27.21
665. Non-decreasing Array
https://leetcode.com/problems/non-decreasing-array/
 */
public class M665_NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {

        /**
         * if encounter nums[i-1] > nums[i], we increase counter
         *      if counter > 1, return FALSE
         *
         * ################################################################################
         * move to the next index, now checking nums[i-2] with nums[i]
         * since now still TRUE, which means we only modify the array 0/1 time
         * by checking the nums[i-2] with nums[i], we can construct Non-Decreasing Array
         * ################################################################################
         *
         *      if nums[i-2] > nums[i]
         *         set the nums[i] = nums[i-1]
         *              3,4,2,6 -> 3,4,4,6
         *              i = 2, nums[i] = 2, nums[i-2] = 3, nums[i-1] = 4
         *
         *
         *      if nums[i-2] <= nums[i]
         *          set the nums[i-1] = nums[i]
         *              1,4,2,6 -> 1,2,2,6
         *              i = 2, nums[i] = 2, nums[i-2] = 1, nums[i-1] = 4
         *
         */

        int counter = 0;

        for(int i = 1; i <nums.length ; i++){
            if(nums[i-1] > nums[i]){
                counter ++;
                if(counter >1){
                    return false;
                }

                if(i-2<0||nums[i-2]<=nums[i]){
                    nums[i-1] = nums[i];

                }else{ // nums[i-2] > nums[i]
                    nums[i] = nums[i-1];
                }
            }
        }
       return true;
    }
}
