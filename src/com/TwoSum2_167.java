package com;

/*
167. Two Sum II - Input array is sorted

https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum2_167 {

    public int[] twoSum(int[] numbers, int target) {

        int front = 0;
        int back = numbers.length-1;


        while(front<=back){
            int sum = numbers[front] + numbers[back];

            if(sum>target){
                back -=1;
            }else if (sum<target){
                front +=1;
            }else{
                return new int[] {front+1,back+1};
            }

        }

        return new int[] {front+1,back+1};
    }
}
