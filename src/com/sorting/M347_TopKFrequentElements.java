package com.sorting;
import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

/*
6.2.21
347. Top K Frequent Elements
https://leetcode.com/problems/top-k-frequent-elements/
 */
public class M347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        /**
         * Hashmap
         */
        int[] ans = new int[k];

        //     < number, frequency>
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

    for(int i = 0;i<k;i++) {
        int max = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        ans[i] = max;
        map.remove(max);
    }
        return ans;
    }
}
