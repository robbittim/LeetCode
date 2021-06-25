package com.greedy;

import java.util.Arrays;

/*
6.24.21
452. Minimum Number of Arrows to Burst Balloons
https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
 */
public class M452_MinNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {

        if(points == null || points.length==0){
            return 0;
        }

        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        System.out.println(Arrays.deepToString(points));

        int end = points[0][1];
        int counter = 1;

        //if the start value in next intervals is greater than previous end value
        // end two intervals are not overlapping
        // so counter ++
        // and update the end value to current interval's end value
        for(int i =0;i<points.length;i++){

            if(points[i][0]>end ){

                counter++;
                end = points[i][1];
            }
        }
        return counter;
    }
}



