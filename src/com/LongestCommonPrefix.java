package com;

import java.util.HashMap;
import java.util.Stack;

/*
14. Longest Common Prefix
https://leetcode.com/problems/longest-common-prefix/

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0) return "";

        String prefix = strs[0];

        for(int i =1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);

            }
        }
        System.out.println(prefix);
        return prefix;
    }

}
