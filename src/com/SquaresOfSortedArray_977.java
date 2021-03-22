package com;

import java.util.Arrays;

public class SquaresOfSortedArray_977 {
/*
977. Squares of a Sorted Array

https://leetcode.com/problems/squares-of-a-sorted-array/

 */
    public int[] sortedSquares(int[] nums) {

        for(int i =0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i] = nums[i] * -1;

//                System.out.println(nums[i]);
            }
            System.out.println(nums[i]);
        }

        Arrays.sort(nums);

        for(int i =0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
            System.out.println("sorted = " +  nums[i]);
        }

        return nums;

    }

}
