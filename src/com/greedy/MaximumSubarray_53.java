package com.greedy;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
53. Maximum Subarray

https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray_53 {

    public int maxSubArray(int[] nums) {
        /*
        if(nums.length==1) return nums[0];
        int ans = 0;

        if(nums.length==2){
            if(nums[0]+nums[1]<nums[0] || nums[0]+nums[1]<nums[1]){
             return nums[0]>nums[1]==true ? nums[0]:nums[1];
            }
        }
        HashSet<Integer> h = new HashSet<Integer>();
        System.out.println(h);
        int maxNegative = Arrays.stream(nums).filter(a->a<0).max().orElse(0);

        for(int i =0;i<nums.length;i++){
            if(nums[i]>0) {
                h.add(new Integer(nums[i]));
            }
        }
        for(Integer i:h){
            ans = ans+ i;
        }
        System.out.println(maxNegative);
        System.out.println(h);
        System.out.println("ans = " + ans);
        if(ans > ans+maxNegative && maxNegative<0){
            System.out.println("ans with negative " + maxNegative);
            return ans+maxNegative;

        }else return ans;
*/

        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for(int i =1;i<nums.length;i++){
            maxCurrent=Math.max(nums[i],maxCurrent+nums[i]);

            if (maxCurrent>maxGlobal){
                maxGlobal=maxCurrent;
                System.out.println("global = " + maxGlobal);
            } }

        System.out.println("final global=" + maxGlobal );
        return maxGlobal;
    }

}
