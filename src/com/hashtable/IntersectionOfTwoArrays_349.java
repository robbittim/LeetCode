package com.hashtable;

import java.util.*;

/*
349. Intersection of Two Arrays
https://leetcode.com/problems/intersection-of-two-arrays/submissions/
 */
public class IntersectionOfTwoArrays_349 {

    public int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> sameList = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        // add all the element from the longer array into set
        for(int i: nums1.length>nums2.length ? nums1:nums2){
            set.add(i);
        }

        System.out.println(set);

        // check if SET contains any element in the shorter array,
        for(int i: nums1.length<nums2.length?nums1:nums2){
            if(set.contains(i)){
                System.out.println("same value = "+ i);
                sameList.add(i);
            }
        }
        int[] out = sameList.stream().mapToInt(Integer::intValue).toArray();
        out = Arrays.stream(out).distinct().toArray();
        System.out.println(Arrays.toString(out));

        return out;


    }

}
