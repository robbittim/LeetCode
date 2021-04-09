package com.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/*
217. Contains Duplicate
https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate_217 {


    public boolean containsDuplicate(int[] nums) {

        /**
         * Using HashMap
         */
        /*
        HashMap<Integer,Integer> dup = new HashMap<>();

        for(int i:nums){
            if(dup.containsKey(i)){
                System.out.println("duplicate found = " + i);
                return true;
            }else {
                dup.put(i,0+1);
            }
        }
        return false;

         */

        /**
         * Using Set, better way!
         */

        Set<Integer> set = new HashSet<>();

        for(int i :nums){
            if(set.contains(i)){
                return true;
            }else {
                set.add(i);
            }
        }
        return false;
    }

}
