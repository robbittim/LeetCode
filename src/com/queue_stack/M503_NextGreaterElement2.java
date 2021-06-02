package com.queue_stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
6.1.21
503. Next Greater Element II
https://leetcode.com/problems/next-greater-element-ii/
 */
public class M503_NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {

        int ans[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        // initialized the ans array to -1, so if there is no greater element exist, its -1
        Arrays.fill(ans,-1);

        //loop twice size of the original array size

        // lets say n = nums.length = 4, then twice of its length, i = 2*4 = 8
        // i % n = i % 4, make sure the index will never exceed nums.length

        // if i = 4, 4 % 4 = 0, its the 1st element of the nums in the 2nd time loop
        // i = 5, 5 % 4 = 1, 2nd element
        for(int i =0;i<2* nums.length;i++){

           while(!stack.isEmpty() && nums[i % nums.length] > nums[stack.peek()]){

               ans[stack.pop()] = nums[i%nums.length];
           }

           //we only add the index to stack on the 1st loop
           if(i<nums.length) {
               stack.add(i);
               }
        }

        return ans;
    }
}
