package com;

import java.util.HashSet;
import java.util.Set;

/*
125. Valid Palindrome
https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome_125 {

    public boolean isPalindrome(String s) {

/*
        s = s.toLowerCase();
        // fail when input is ".," or "a.", or "abb"
        if(s.length() == 0 || s.length() == 1) {
            return true;
        }

        if(s.length()==2 && s.charAt(0)!='.' && s.charAt(1)!='.'){


            return s.charAt(0) == s.charAt(1);
        }

        String newS = s
                .replace(",","")
                .replace(" ","")
                .replace(":","")
                .replace("-","")

                .toLowerCase();

        int temp = newS.length()/2;
        System.out.println("temp = " + temp);
        System.out.println(newS);
        int count = 0;

        for(int i=1;i<newS.length();i++){
            System.out.println("front = " + newS.charAt(i-1));

            System.out.println("back  = " + newS.charAt(newS.length() - i - 1));

            if(newS.charAt(0) == newS.charAt(newS.length()-1)) {

                if(i<temp) {
                        if(newS.charAt(i)==newS.charAt(newS.length() - i - 1)){
                            count ++;
                        }
                }
            }
            }

        System.out.println("count = " + count);
        if( temp - count ==1 || temp == count){

            System.out.println("Valid Palindrome");
            return true;
        }else
            return false;


 */
        String newS = "";

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)||Character.isLetter(c)){
                newS += c;
                System.out.println(newS);
            }
        }

        newS = newS.toLowerCase();

        int front = 0;
        int back = newS.length()-1;



        while(front<=back){
            if(newS.charAt(front)!=newS.charAt(back)){

                return false;
            }
            //to stop infinitely while loop
            front+=1; // increase front index
            back-=1;  // decrease back  index
        }
        return true;

    }
}
