package com.array;

import java.util.HashMap;
import java.util.Map;

/*
169. Majority Element
https://leetcode.com/problems/majority-element/
 */
public class MajorityElement_169 {


    public int majorityElement(int[] nums) {

        if(nums.length==1) return nums[0];

        Map<Integer,Integer> dup = new HashMap<>();

        for(int i:nums){
            System.out.println(i);
            System.out.println("dup.get(i)=" + dup.get(i));
            if(dup.containsKey(i) && dup.get(i)+1>nums.length/2){
            return i;
            }else{
                dup.put(i, dup.getOrDefault(i,0)+1);

            }

        }

        System.out.println(dup);

        return  -1;
    }
}
