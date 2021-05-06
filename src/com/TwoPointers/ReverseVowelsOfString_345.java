package com.TwoPointers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
5.5.21
345. Reverse Vowels of a String
https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowelsOfString_345 {
    public String reverseVowels(String s) {

        /** Time Limit Exceeded
         *
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');

        int front = 0;
        int back = s.length()-1;

        StringBuilder sb = new StringBuilder(s);
        while(front<back){
            if(list.contains(s.charAt(front)) && list.contains(s.charAt(back))){
                System.out.println("s.charAt(front)= " + s.charAt(front));
                System.out.println("s.charAt(back) = " + s.charAt(back));

                sb.setCharAt(back,s.charAt(front));
                sb.setCharAt(front,s.charAt(back));

                 front++;
                 back--;

                 if(front + 1 ==back){
                     System.out.println("toString front < back = " + sb.toString());
                     return sb.toString();
                 }
            }
            else if(list.contains(s.charAt(front)) && !list.contains(s.charAt(back))){
                back--;
            }else  if(!list.contains(s.charAt(front)) && list.contains(s.charAt(back))){
                front++;
            }
        }
        System.out.println("toString = " + sb.toString());

        return sb.toString();

         */


        Set<Character> set = new HashSet<>();
        set.add('A'); set.add('E'); set.add('I'); set.add('O'); set.add('U');
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');

        char [] c= s.toCharArray();
        int front = 0;
        int back = s.length()-1;

        while(front<back){

        if(!set.contains(c[front])){
            front ++;
        }else if (!set.contains(c[back])){
            back --;
        }else {
            char temp = c[front];
            c[front] = c[back];
            c[back] = temp;
            front++;
            back--;
        }

        }

        return new String(c);


    }
}
