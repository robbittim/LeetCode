package com;

import java.util.HashSet;
import java.util.Set;
/*
680. Valid Palindrome II
https://leetcode.com/problems/valid-palindrome-ii/
 */
public class ValidPalindrome2_680 {


    public boolean validPalindrome(String s) {

        /*
        if(s.length()<=2) return true;

        if(s.length()==3){
            System.out.println("length = 3");
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(2));
            if(s.charAt(0)!=s.charAt(2))
            return false;
        }

        Set<String> set = new HashSet<>();

        int front = 0;
        int back = s.length()-1;



        if(s.length()>4) {
            while (front < back) {
                if (s.charAt(front) != s.charAt(back)) {
                    if(s.charAt(front+1)!=s.charAt(back-1)) {
                        System.out.println("front =" + s.charAt(front));
                        System.out.println("back = " + s.charAt(back));
                        return false;
                    }
                }else{
                    set.add(String.valueOf(s.charAt(front)));
                    set.add(String.valueOf(s.charAt(back)));

                    if (set.size() == 2) {
                        System.out.println("set size = " + set.size());
                        return true;
                    }
                }
                front += 1;
                back -= 1;
            }
        }*/

        int front = 0;
        int back = s.length()-1;

        while (front<back){
            if(s.charAt(front)!=s.charAt(back)){
                return isPalindrome(s,front+1,back) || isPalindrome(s,front,back-1);
            }else{
                front +=1;
                back -=1;
            }
        }
        return true;
    }
    private boolean isPalindrome (String s, int front, int back){
        while(front<back){
            if(s.charAt(front++) != s.charAt(back--)){
                return false;
            }
        }
        return true;
    }


}
