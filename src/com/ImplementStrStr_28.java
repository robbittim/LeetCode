package com;

/*
28. Implement strStr()
https://leetcode.com/problems/implement-strstr/

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Input: haystack = "hello", needle = "ll"
Output: 2

 */
public class ImplementStrStr_28 {

    public int strStr(String haystack, String needle) {
            int ans = 0;

            if(haystack.contains(needle)){
                ans = haystack.indexOf(needle);
                System.out.println(ans);
            }else
                return -1;

        return ans;
    }
}
