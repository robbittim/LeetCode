package com.greedy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
6.29.21
763. Partition Labels
https://leetcode.com/problems/partition-labels/
 */
public class M763_PartitionLabels {
    public List<Integer> partitionLabels(String s) {

        /**
         * input s = ababcbacadefegdehijhklij
         *
         *
         * System.out.println('a'-'a') = 0
         * System.out.println('b'-'a') = 1
         * System.out.println('z'-'a') = 25
         */

        if (s == null || s.length() == 0) {
            return null;
        }

        List<Integer> output_arr = new ArrayList<>();

        // lower case letter, 26
        int[] lastIndex = new int[26];


        for (int i = 0; i < s.length(); i++) {

            /**
             * #######################################
             *  lastIndex[s.charAt(i) - 'a'] = i;
             * #######################################
             *
             *  lastIndex[] contain last index of each letter at
             *  when we see a letter appears, we update lastIndex[] with i
             *
             *    so for input s = ababcbacadefegdehijhklij
             *
             *      at S.charAt index = 0 , a appears 1st time
             *      at S.charAt index = 8,  a appears last time
             *          so update lastIndex[0] to 8
             *
             *      at S.charAt index = 1 , b appears 1st time
             *      at S.charAt index = 5,  b appears last time
             *          so update lastIndex[1] to 5
             *
             *      lastIndex[] = [8, 5, 7, 14, 15, 11, 13, 19, 22, 23, 20, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
             */

            lastIndex[s.charAt(i) - 'a'] = i;
            // System.out.println(lastIndex[s.charAt(i)-'a']);
        }

        int start = 0;
        int end = 0;

        System.out.println(Arrays.toString(lastIndex));

        for (int i = 0; i < s.length(); i++) {

            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);

//          System.out.println(lastIndex[s.charAt(i)-'a']);

            System.out.println("end = " + end + " for char = " + s.charAt(i) + " for lastIndex[i] = " + lastIndex[i] + " with i value = " + i + " for lastIndex[s.charAt(i) - 'a'] = " + lastIndex[s.charAt(i) - 'a']);
//            System.out.println("start = " + start);

            if (i == end) { // if current index == end of current partition, we can save the length of current partition
                output_arr.add(end - start + 1); // we want the length of each partition, not the index, so we plus 1
                start = end + 1;    // the beginning of next partition is the last partition's end index + 1
            }
        }
        return output_arr;
    }
}
