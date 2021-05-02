package com.math;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
5.2.21
415. Add Strings
https://leetcode.com/problems/add-strings/
 */
public class AddStrings_415 {
    public String addStrings(String num1, String num2) {


        StringBuilder sb = new StringBuilder();

        int n1L = num1.length() - 1;
        int n2L = num2.length() - 1;
        int n1LastDigit = 0;
        int n2LastDigit = 0;
        int carry = 0;


        while (n1L >= 0 || n2L >= 0) {


            if (n1L >= 0) {
                char c1 = num1.charAt(n1L);
                n1LastDigit = c1 - '0';
                System.out.println("num1.charAt = " + num1.charAt(n1L));
            } else {
                n1LastDigit = 0;
            }

            if (n2L >= 0) {
                char c2 = num2.charAt(n2L);
                n2LastDigit = c2 - '0';
            } else {
                n2LastDigit = 0;
            }


//            int n1LastDigit = n1L>=0? num1.charAt(n1L) - '0':0;
//
//            int n2LastDigit = n2L>=0 ? num2.charAt(n2L) - '0':0;

            int result = (n1LastDigit + n2LastDigit + carry) % 10;
            carry = (n1LastDigit + n2LastDigit + carry) / 10;
            sb.append(result);

            System.out.println("n1LastDigit = " + n1LastDigit);
            System.out.println("n2LastDigit = " + n2LastDigit);

            System.out.println("result = " + result);

            n1L--;
            n2L--;

        }

        if (carry != 0) {
            sb.append(carry);
        }

        System.out.println(sb.reverse().toString());
        return sb.reverse().toString();

        /**
         * will fail for large input
         */
      /*
        String ans = "";
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = n1+n2;
        ans = Integer.toString(n3);
        System.out.println("ans = " + ans);
        return ans;

       */

        /**
         * Using BigInger
         */
//        BigInteger b1 = new BigInteger(num1);
//        BigInteger b2 = new BigInteger(num2);
//        return  b1.add(b2).toString();
    }
}
