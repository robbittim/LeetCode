package com;
/*

35. Search Insert Position
https://leetcode.com/problems/search-insert-position/

 */
public class SearchInsertPosition_35 {

    public int searchInsert(int[] nums, int target) {

        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                index = i;
                return index;
            }else if(nums[i] < target  ){
                index=i+1;
                System.out.println("index = " + index);
            }
        }
        System.out.println(index);

        return index;
    }
}
