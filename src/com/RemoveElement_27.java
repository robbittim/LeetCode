package com;

import sun.security.util.ArrayUtil;

import java.util.LinkedList;
import java.util.List;

/*
27. Remove Element

https://leetcode.com/problems/remove-element/

 */
public class RemoveElement_27 {


    public int removeElement(int[] nums, int val) {

     int size =0;

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                // since num[j] is NOT EQUAL to val, so we move num[j] to the front of array
                // everyday we do that, we increment the size of correct array
            nums[size] = nums[j];
            size++;
            }
        }


        return size;
    }
}



