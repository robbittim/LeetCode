package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
283. Move Zeroes
https://leetcode.com/problems/move-zeroes/

 */
public class MoveZeroes_283 {

    public void moveZeroes(int[] nums) {

/** Wont work: you must do this in-place without making a copy of the array.

        List<Integer> list = new ArrayList<>();
        int counter = 0;

        for(int i : nums){
            if(i!=0){
                list.add(i);
            }else counter++;
        }

        System.out.println("non-zero list = " + list);
        System.out.println("how many zero = "+ counter );

        for(int i =0;i<counter;i++){
            list.add(0);
        }

        System.out.println("zero list = " + list);

 */

        /**
        Two pointer
         */
        int index = 0;
        for(int i = 0; i<nums.length;i++){

            if(nums[i]!=0) {
                nums[index]=nums[i];
                index ++;
            }

                System.out.println(Arrays.toString(nums));
            }

        for(int i=nums.length-1;i>=index;i--){
            nums[i]=0;

        }


    }

}
