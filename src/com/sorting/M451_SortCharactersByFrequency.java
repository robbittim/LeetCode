package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
6.2.21
451. Sort Characters By Frequency
https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class M451_SortCharactersByFrequency {
    public String frequencySort(String s) {

//        PriorityQueue<Character> pq = new PriorityQueue<>();
//
//        for(Character c: s.toCharArray()){
//            pq.add(c);
//        }
//        System.out.println(pq.size());
//
//        ArrayList<Character> list = new ArrayList<>();
//
//        while(!pq.isEmpty()){
//            list.add(pq.remove());
//        }
//
//        Character[] c = new Character[list.size()];
//        list.toArray(c);
//
//        Stream<Character> charStream = Arrays.stream(c);
//        String string = charStream.map(String::valueOf).collect(Collectors.joining());
//
//        System.out.println("stirng = " + string);
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(string);
//
//
//        String ans = sb.reverse().toString();
//
//        System.out.println("reversed = " + ans);
//
//        Character test1 = 'A';
//        Character test2 = 'b';
//
//        System.out.println("compare test "  + test1.compareTo(test2));
//
//        System.out.println("list = " + list);
//        System.out.println("c = " + Arrays.toString(c));
//        System.out.println("pq = " + pq);

        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) +1);
        }

        /**https://stackoverflow.com/questions/29872664/add-key-and-value-into-an-priority-queue-and-sort-by-key-in-java/29873362
         *
         * the pattern a - b sorts by smallest first(which is the default sorting)
         * b - a sorts by largest values first.
         *
         * pattern a - b  =
         * PriorityQueue<Character> maxHeap = new PriorityQueue<>(((a,b) ->map.get(a) - map.get(b))) == PriorityQueue<Character> maxHeap = new PriorityQueue<>()
         */

        //create maxHeap
        //determine how to compare two items : based on the frequency which is the value in the map <Character, Integer>
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(((a,b) ->map.get(b) - map.get(a)));

        maxHeap.addAll(map.keySet());

        StringBuilder result = new StringBuilder();

        while(!maxHeap.isEmpty()){
            char currentChar = maxHeap.remove();

            //add to StringBuilder for how many times THAT character appears
            //if the input is : "tree", and the currentChar is 'e'
            //in map, it will be <'e', 2>
            //so get the value of the key 'e', then appends to StringBuilder based on its frequency
            for(int i =0;i<map.get(currentChar);i++){
                result.append(currentChar);
            }

        }
        System.out.println(result.toString());
        return result.toString();


    }
}
