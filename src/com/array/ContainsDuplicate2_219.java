package com.array;

import java.util.*;

/*
219. Contains Duplicate II

https://leetcode.com/problems/contains-duplicate-ii/

 */
public class ContainsDuplicate2_219 {


    public boolean containsNearbyDuplicate(int[] nums, int k) {

        /** reverse the nums[]

        int[] arrDesc = Arrays.stream(nums).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

         */

//        System.out.println(Arrays.toString(nums));
            // map => value:index
        HashMap<Integer,Integer> map = new HashMap<>();

        if(nums.length==2) {
            if(nums[0]==nums[1]){
                return 1<=k ? true:false;
            }else return false;
        }


        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                System.out.println("i value = " + i);
                System.out.println("map.get(nums[i]) = " +map.get(nums[i]));
              if(Math.abs(map.get(nums[i])-i)<=k){
                 return true;
              }
            }
            map.put(nums[i],i);

        }
        System.out.println(map);

        return false;

    }
}
