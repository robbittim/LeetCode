package com;

public class PalindromeNumber {

    /*
    9. Palindrome Number

    https://leetcode.com/problems/palindrome-number/
     */

    public boolean isPalindrome(int x) {

        int reverse = 0;
        int reminder = 0;
        int temp = x;

        if(x <0){
            return false;
        }
        while(x!=0){
            reminder = x%10;
            x /=10;
            reverse = reverse*10+reminder;
            System.out.println(reverse);
        }
        System.out.println("reverse = "+ reverse);

        System.out.println("x value = " + x);

        // x is 0 now, need another value to store x's value
        if(reverse==temp){
            System.out.println("true "+ reverse);
            return true;
        }else {
            System.out.println("false = "+ reverse);
            return false;
        }
    }
}
