package com.TwoPointers;

public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //A = nums1, B = nums2

        while(m>0 && n>0){
            //if the last element in A is greater than last element in B
            if(nums1[m-1]>nums2[n-1]){
                //Set the last index of A to the last element of A
                nums1[n+m-1] = nums1[m-1];
                m--;
            }else{
                //Set the last index of A to the last element of B
                nums1[n+m-1] = nums2[n-1];
                n--;
            }

        }
        // Special case:
        // dont have any initialize element in A
        // AND
        // 1 elements in B .
        // copy element of B to A
        while(n>0){
            nums1[n+m-1] = nums2[n-1];
            n--;
        }


    }
}
