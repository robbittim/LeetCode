package com.math;
/*

504. Base 7
https://leetcode.com/problems/base-7/
 */
public class Base7_504 {

    public String convertToBase7(int num) {

        if(num==0){
            return "0";
        }

        boolean isNegative = num<0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();
        while(num>0){

            int mod = num%7;
            System.out.println("mod = " + mod);

            sb.append(mod);

            num = num/7;

            System.out.println("num = " + num);

            System.out.println("sb in side = "+ sb.toString());

        }

        String ans = sb.reverse().toString();

        if(isNegative){
            ans = "-"+ans;
        }


        System.out.println("sb out side" + sb.toString());


//        return Integer.toString(num,7);
            return ans;
    }



}
