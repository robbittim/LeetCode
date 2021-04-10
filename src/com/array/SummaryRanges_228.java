package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

228. Summary Ranges
https://leetcode.com/problems/summary-ranges/submissions/
 */
public class SummaryRanges_228 {

    public List<String> summaryRanges(int[] nums) {

     List<String> ans = new ArrayList<>();


     for(int i=0;i<nums.length;i++){

         int current = nums[i];

         while(i<nums.length-1 && nums[i] + 1 == nums[i + 1]){
             i++;
         }

         if(current != nums[i]){
             ans.add(current + "->" + nums[i]);
             System.out.println(ans);
         }else
             ans.add(current + "");
         System.out.println("only 1 number  = " + ans);

         }

     return ans;


    }

}
