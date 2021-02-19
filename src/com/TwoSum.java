package com;

/*

Leetcode 1: Two Sum

https://leetcode.com/problems/two-sum/

 */
public class TwoSum {

    public int[] twoSumSolution(int[] nums, int target) {

        int ans[] = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] == target-nums[i]){
                   ans[0] = i;
                   ans[1] = j;
                    System.out.println(i + "test " + j);
                    return ans;
                }
            }
        }
        System.out.println(ans);
            return null;
        }

    }



