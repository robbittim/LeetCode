package com.greedy;

import java.util.Arrays;
/*
6.23.21
455. Assign Cookies
https://leetcode.com/problems/assign-cookies/
 */
public class E455_AssignCookies {

    public int findContentChildren(int[] g, int[] s) {

        if(g==null || s== null) return 0;

        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0; int si = 0;

        while(gi<g.length && si<s.length ){

            if(g[gi]<=s[si]){

                gi++;

            }
            si++;

        }

        return gi;


    }
}
