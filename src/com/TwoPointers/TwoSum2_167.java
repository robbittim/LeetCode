package com.TwoPointers;

import com.sun.scenario.effect.impl.prism.PrReflectionPeer;

/*
5.3.21 - 2nd time, under two pointers category

167. Two Sum II - Input array is sorted
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
public class TwoSum2_167 {

    public int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[2];

        if(numbers.length==2) {
            ans[0] = 1;
            ans[1] = 2;
            return ans;

        };

        int front = 0;
        int back = numbers.length-1;

        while(front<=back){

            System.out.println("slow = " + numbers[front]);
            System.out.println("fast = " + numbers[back]);

            int sum = numbers[front] + numbers[back];


            if(sum > target) {
                back--;
            }else if (sum<target){
                front++;
            }else {
                ans[0] = front+1;
                ans[1] = back+1;
                return ans;
            }


        }
        ans[0] = front+1;
        ans[1] = back+1;
        return ans;



    }


}
