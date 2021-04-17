package com.hashtable;

import java.util.ArrayList;
import java.util.HashMap;

/*
290. Word Pattern
https://leetcode.com/problems/word-pattern/
 */
public class WordPattern_290 {
    public boolean wordPattern(String pattern, String s) {

        if(pattern.length()>s.length()) return false;

        String sAry [] = s.split(" ");

        if (pattern.length() != sAry.length) {
            System.out.println("not the same length, return false");
            return false;
        }

        HashMap<Character,String> map = new HashMap<>();

        for(int i=0;i<sAry.length;i++) {

                if (map.containsKey(pattern.charAt(i))) {
                    if (!map.get(pattern.charAt(i)).equals(sAry[i])) {
                        System.out.println("map.get(pattern.charAt(i))=" + map.get(pattern.charAt(i)));
                        System.out.println("sAry[i]=" + sAry[i]);
                        System.out.println("return false");
                        return false;
                    }
                } else if (!map.containsKey(pattern.charAt(i))) {

                    if (map.containsValue(sAry[i])) {
                        System.out.println("contain same value ");
                        System.out.println("also return false");
                        return false;
                    }
                }
                map.put(pattern.charAt(i), sAry[i]);
                System.out.println("map.put");
        }

        return true;
    }
}
