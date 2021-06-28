package com.greedy;

/*
6.27.21
392. Is Subsequence
https://leetcode.com/problems/is-subsequence/submissions/
 */
public class E392_IsSubSequence {

    public boolean isSubsequence(String s, String t) {

        StringBuilder sb = new StringBuilder();

        if(s.length() ==0) {
            return true;
        }

        int s_pointer = 0;
        int t_pointer = 0;

        while(t_pointer<t.length()){
            if(s.charAt(s_pointer ) == t.charAt(t_pointer)){
                sb.append(s.charAt(s_pointer));
                s_pointer++;

                if(s_pointer == s.length()){
                    return true;
                }
            }
            t_pointer++;
        }

        System.out.println(sb.toString());
//
//        if(s.equals(sb.toString())){
//            return true;
//        }else{
//            return false;
//        }

    return false;
    }

}
