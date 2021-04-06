package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
136. Single Number
https://leetcode.com/problems/single-number/
 */
public class SingleNumber_136 {


    public int singleNumber(int[] nums) {

        /*****************************
         * Replace duplicate number  *
         *****************************/

        /*
        Arrays.sort(nums);
        int temp = 0;

        if(nums.length==1) return nums[0];

        for(int i =0;i<nums.length-1;i++){

            if(nums[i] == nums[i+1]){
                System.out.println("same value = " + nums[i]);

                nums[i] =0;
                nums[i+1] = 0;

            }
            System.out.println(nums[i]);

        }

     for(int i=0;i<nums.length;i++){
         if(nums[i]!=0) {
         temp = nums[i];
         }
         System.out.println("0 value = " + nums[i]);
     }

        System.out.println("temp value = " + temp);
        return temp;


         */

        /*********************************
         * BEST method: Bit Manipulation *
         *********************************/

        /*
        int result = 0;
        for(int i =0;i<nums.length;i++){
            result ^=nums[i];
        }
        return result;
        */

        /******************
         * HashSet method *
         *****************/

        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            if(set.contains(i)){
                set.remove(i);
            }else
                set.add(i);
        }

        for(int i : set){
            return i;
        }
        return -1;


    }

}
