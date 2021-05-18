package com.TwoPointers;

import java.util.List;
/*
5.17.21
524. Longest Word in Dictionary through Deleting
https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
 */
public class LongestWordInDictionary_524 {

    public String findLongestWord(String s, List<String> dictionary) {

        String result = "";

        for(String word:dictionary){
            int wordLength = word.length(); int resultLength=result.length();
                // two pointers check if word is the sub-sequence of String s
                if( isSubString(s,word)){
                        //Length of word in the list  > result || length is equal but word is lexicographically small
                      if(wordLength>resultLength || (wordLength==resultLength && word.compareTo(result)<0)){
                          result = word;
                      }

         }
        }

        return result;

    }

    public boolean isSubString(String s, String word){

        int l1 = 0; int l2=0;

        while(l1<s.length() && l2<word.length()){
            //if both char are the same, compare the next char of word with String s
            if(s.charAt(l1)==word.charAt(l2)){
             l2++;
            }
            l1++;

        }
        //if pointer l2 is reach to the end (word), then word is the subSequence of String s
        return l2==word.length() ;


    }


}
