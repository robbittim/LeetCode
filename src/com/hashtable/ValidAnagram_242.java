package com.hashtable;

import java.util.Arrays;
import java.util.HashMap;
/*
242. Valid Anagram
https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram_242 {

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length() || s==null || t==null){
            return false;
        }

        /** Hash Table

        //count how many time a letter appears
        //increase the counter for each letter in s
        //decrease the counter for each letter in t
        //if the counter is 0 at the end
        //two strings are anagram

        */
        /*
          int [] coutns = new int[26];

        for(int i =0;i<s.length();i++){
          coutns[s.charAt(i)-'a']++;//[2,0,0,...]
            System.out.println("s.char= " + s.charAt(i) );
            System.out.println(coutns[i]);
            coutns[t.charAt(i)-'a']--;//[0,0,0,...]
        }

        for(int i:coutns){
            System.out.println("count = " + i);
            if(i!=0){
                return false;
            }
        }
        return true;

         */

        /**
         * Sorting
         *
         * An anagram is produced by rearranging the letters of String s into String t.
         * Therefore, if String t is an anagram of String s, sorting both strings will result in two identical strings.
         * Furthermore, if String s and String t have different lengths, String t must not be an anagram of String s and we can return early.
         */

        char[] ary1 = s.toCharArray();
        char[] ary2 = t.toCharArray();

        Arrays.sort(ary1);
        System.out.println("ary1 = " + Arrays.toString(ary1));
        Arrays.sort(ary2);
        System.out.println("ary2 = " + Arrays.toString(ary2));

        return Arrays.equals(ary1,ary2);

    }
}



