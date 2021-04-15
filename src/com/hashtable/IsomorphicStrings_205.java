package com.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
205. Isomorphic Strings
https://leetcode.com/problems/isomorphic-strings/
 */
public class IsomorphicStrings_205 {
    public boolean isIsomorphic(String s, String t) {


        if(s == null || t==null || s.length()!=t.length()) return false;
        //map1 -> {s.char, t.char} ; map2 -> {t.char, s.char}
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();

        char x,y;

        for(int i = 0;i<s.length();i++){

            x=s.charAt(i);
            y=t.charAt(i);

            System.out.println("x = " + x);
            System.out.println("y = " + y);
            if(map1.containsKey(x)){
                if(map1.get(x)!=y){
                    System.out.println("map1, return false");
                    return false;
                }
                }
            else{
                map1.put(x,y);
                System.out.println("map 1, x = " + x + " y = " + y );
            }

            if(map2.containsKey(y)){
                if(map2.get(y)!=x){
                    System.out.println("map2, return false");
                    return false;
                }
            }
            else{
                map2.put(y,x);
                System.out.println("map 2, x = " + x + " y = " + y );
            }


        }

        return true;
    }


}
