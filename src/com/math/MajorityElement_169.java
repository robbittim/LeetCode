package com.math;

import java.util.HashMap;
import java.util.Map;

/*
5.2.21
169. Majority Element
https://leetcode.com/problems/majority-element/submissions/
 */
public class MajorityElement_169 {
    public int majorityElement(int[] nums) {

        int ans = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        System.out.println(map);

        Map.Entry<Integer,Integer> maxEntry = null;

            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(maxEntry==null|| entry.getValue().compareTo(maxEntry.getValue())>0){
                    maxEntry = entry;
                }
            }

        System.out.println(maxEntry.getKey());
            ans = maxEntry.getKey();
        return ans;



    }

}
