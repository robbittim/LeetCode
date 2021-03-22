package com;

import java.util.Arrays;

/*
88. Merge Sorted Array
https://leetcode.com/problems/merge-sorted-array/

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
 */
public class MergeSortedArray_88 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=m;i<nums1.length;++i){  //start from non-sorted element in nums1
            nums1[i]=nums2[i-m];  //the first non-sorted element will be the first sorted element in num2
 //i=3,m=3, nums1[3]=nums2[0]
        }

        Arrays.sort(nums1);
    }

}
