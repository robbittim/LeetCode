package com.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/*
6.1.21
215. Kth Largest Element in an Array
https://leetcode.com/problems/kth-largest-element-in-an-array/description/
 */
public class M215_KthLargestElement {
    public int findKthLargest(int[] nums, int k) {

        /**
         * Sorting
         */
//        Arrays.sort(nums);
//        return nums[nums.length - k];

        /**
         * Priority Queue: like a queue, but based on the priority head
         *
         * the element in the pq are ordered according to the natural ordering
         * So, 1 is the highest priority...and always be removed 1st
         *
         * Default as min heap
         *
         * max head with Colletions.reverseOrder():
         *
         * PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
         */

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0;i<nums.length;i++){
            pq.add(nums[i]);

            // we only want the kth maximum, so pq.size should less than k
            // since we have removed other smaller number in pq
            // the top of the queue is the answer
            if(pq.size()>k){
                pq.poll();
            }
        }

        return pq.peek();


    }
}
