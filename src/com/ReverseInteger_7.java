package com;

/*

7. Reverse Integer

https://leetcode.com/problems/reverse-integer/
 */

public class ReverseInteger_7 {


        public int reverse(int x) {
            int ans =0;
            int remainder = 0;
             if( x ==0 ){
                return 0;
            }
             while(x!=0){
                System.out.println(x%10);
                 remainder =x%10;
                 x/=10;

                 if(ans>Integer.MAX_VALUE/10 || ans==Integer.MAX_VALUE/10 && remainder>7 ) return 0;
                 if(ans<Integer.MIN_VALUE/10 || ans ==Integer.MIN_VALUE/10 && remainder<-8)  return 0;
                 ans = ans*10+remainder;
             }
            System.out.println("ans= " + ans);
       return ans;

    }
}
