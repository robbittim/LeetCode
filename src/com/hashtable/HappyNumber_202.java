package com.hashtable;

import java.util.HashSet;

/*
202. Happy Number
https://leetcode.com/problems/happy-number/
 */
public class HappyNumber_202 {

    public boolean isHappy(int n) {

        if(n==1) return true;

        HashSet<Integer> set = new HashSet<>();

        while(n!=1){
            int temp = 0;

            while(n!=0){
                int digit = n%10;
                temp +=digit*digit;
                n/=10;
            }


            // add element in to set
            // if element already in the set, we have infinite loop, then return false

            //add(), will add element if not present in the HashSet,
            //else the function return false if the elements already in the HashSet
            if(!set.add(temp)){
                return false;
            }

            n = temp;
        }
        return true;
    }


}
