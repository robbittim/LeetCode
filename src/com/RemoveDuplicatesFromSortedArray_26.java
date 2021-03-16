package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
    26. Remove Duplicates from Sorted Array
 */
public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2) return nums.length;

        int temp = 0;

        for(int i = 1;i<nums.length;i++){
            if(nums[temp]!=nums[i]){
                temp++;
                nums[temp] = nums[i];
                System.out.println(temp);
            }
        }
        return temp+1;
    }
}
