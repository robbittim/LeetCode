package com.array;

import java.util.Arrays;

/*

268. Missing Number
https://leetcode.com/problems/missing-number/

 */
public class MissingNumber_268 {

    public int missingNumber(int[] nums) {

/*
        Arrays.sort(nums);
        if (nums.length == 1) {
            System.out.println("return 1");
            return 1;
        }
        // Ensure that n is at the last index
        if (nums[nums.length - 1] != nums.length) {
            System.out.println("return nums.lenth = " + nums.length);
            return nums.length;
        }
        // Ensure that 0 is at the first index
        else if (nums[0] != 0) {
            return 0;
        }

        int n = nums.length + 1;
        System.out.println("n = " + n);

        boolean check = true;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("i value = " + i);
            System.out.println("nums[i] = " + nums[i]);

            if (i != nums[i]) {
                System.out.println();
                System.out.println("found missing number = " + i);
                return i;
            }


        }

        return -1;

 */

        for(int i =0;i<nums.length;i++){
            int temp = nums.length;
            temp = temp ^ i ^ nums[i];
            System.out.println("missing number  = " + temp);
            if(temp!=0){

            }
        }

        return -1;

    }

}
