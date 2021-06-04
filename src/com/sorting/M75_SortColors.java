package com.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class M75_SortColors {
    public void sortColors(int[] nums) {

        int start = 0 ;  // check for element = 0
        int currentIndex = 0;

        int end = nums.length-1;  // check for element = 2

        while(start<=end){

            if(nums[currentIndex] == 0){

                //swap currentIndex with the start(front of the array)
                nums[currentIndex] = nums[start];
                //set start to 0
                nums[start] = 0;

                start++;
                currentIndex++;

            }else if (nums[currentIndex] ==2){

                //swap currentIndex with the end(back of the array)
                nums[currentIndex] = nums[end];
                //set back to 2
                nums[end] =2;
                end--;

            }else {
                //if element is 1, dont care, move to next element
                currentIndex++;
            }

        }

      return;
    }
}
