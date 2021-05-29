package com.queue_stack;

import java.util.*;
/*
5.28.21
739. Daily Temperatures
https://leetcode.com/problems/daily-temperatures/
 */
public class M739_DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {

        int[] dist = new int[temperatures.length];

        Stack<Integer> indexs = new Stack<>();

        for (int curIndex = 0; curIndex < temperatures.length; curIndex++) {

            while (!indexs.isEmpty() && temperatures[curIndex] > temperatures[indexs.peek()]) {
                 int preIndex = indexs.pop();
                System.out.println("preIndex = " + preIndex);
                System.out.println("curIndex = " + curIndex);
                dist[preIndex] = curIndex - preIndex;
            }
            indexs.add(curIndex);
        }

        for(int i : dist){
            System.out.println("disk = " + i );

        }
        return dist;
    }
}
