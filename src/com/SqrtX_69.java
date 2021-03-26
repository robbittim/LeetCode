package com;

/*
69. Sqrt(x)

https://leetcode.com/problems/sqrtx/
 */
public class SqrtX_69 {

    public int mySqrt(int x) {

        int ans = 0;

        double sqrt = Math.sqrt(x);

        ans = (int)sqrt;
        System.out.println("sqrt = " + sqrt);
        return ans;


    }

}
