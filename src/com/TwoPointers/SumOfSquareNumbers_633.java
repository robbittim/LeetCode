package com.TwoPointers;

/*
5.4.21
633. Sum of Square Numbers
https://leetcode.com/problems/sum-of-square-numbers/
 */
public class SumOfSquareNumbers_633 {

    public boolean judgeSquareSum(int c) {


        System.out.println((int)Math.sqrt(c));

        int left = 0;
        int right = (int)Math.sqrt(c);

        while(left<=right){
            int sum = left*left+right*right;

            if(sum == c){
                return true;
            }

           else if(sum>c){
                right--;
            }else{
                left++;
            }



        }

        return false;


    }


}
