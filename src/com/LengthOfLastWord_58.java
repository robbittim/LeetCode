package com;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
58. Length of Last Word
https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord_58 {

    public int lengthOfLastWord(String s) {


        String noSpace[] = s.split(" ");
        int n = noSpace.length;

        if(n > 0) {
            System.out.println(noSpace[n - 1].length());
            return noSpace[n - 1].length();
        }
        else
            return 0;
    }
}


