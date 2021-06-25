package com.greedy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
/*
6.24.21
435. Non-overlapping Intervals
https://leetcode.com/problems/non-overlapping-intervals/
 */
public class M435_NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {

        if(intervals == null || intervals.length == 0) return 0;

        /**
         * sort based on end val
         *
         * method1: Using comparingInt
         *
         *      Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
         *
         * method2: rewrite Comparator
         *
         *      Arrays.sort(intervals, new Comparator<int[]>() {
         *         @Override
         *           public int compare(int[] o1, int[] o2) {
         *           return (o1[1] < o2[1]) ? -1 : ((o1[1] == o2[1]) ? 0 : 1);
         *      }
         * });

          a[1] - b[1] is comparing the 2nd element in the array

        Input:  int intervals[][] = {{1,2},{2,3},{3,4},{1,3}};

        Based on 2nd(end) element:
              Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
              result:  [[1, 3], [2, 2], [2, 3], [3, 4]]

        Based on 1st(start) element:
             Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
             result:  [[1, 3], [2, 2], [2, 3], [3, 4]]
         */
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);

        /**
         * print 2D array
         */
        System.out.println(Arrays.deepToString(intervals));

        int counter = 0;

        //Get the end value of the first interval
        int end = intervals[0][1];

        //since end value is in index of 0
        //so the loop start from 1
        for(int i =1;i<intervals.length;i++){
            // if current start val is greater than or equal to the end val
            // then it's not overlapping
            if(intervals[i][0] >= end){

                end = intervals[i][1];//update to current interval's end val to the next index

            }
            else{
                counter ++;//else it overlaps, so increment the count
            }
        }
        return counter;
    }


}
