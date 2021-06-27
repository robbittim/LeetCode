package com.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
6.26.21
406. Queue Reconstruction by Height
https://leetcode.com/problems/queue-reconstruction-by-height/
 */
public class M406_QueueReconstructionbyHeight {

    public int[][] reconstructQueue(int[][] people) {

        List<int[]> result = new ArrayList<>();
        // 若高度相同则根据名次end升序排序，若高度不同则根据高度降序排序，
        // 这样高度低的就可以在后面程序插入中插入到前面的位置，将比它高的挤到后面

        //same as using Comparator
//        Arrays.sort(people,(a,b) -> a[0]==b[0] ? a[1] - b[1] : b[0]-a[0]);

        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]!=o2[0]) {  // diff height, compare order
                    return o2[0] - o1[0]; // higher value h first
                }else{
                      return o1[1] - o2[1];// smaller order  k first
                    }

                }

        });

        System.out.println( Arrays.deepToString(people));

        for(int[] x: people){
//            System.out.println("height = " + x[0]);
                System.out.println("insert index = " + x[1]);
            //insert people[] into List at index k based on k value
            result.add(x[1],x);

//            for(int [] i :result){
//                System.out.println("!!result value 0 !! = " + i[0]);
//                System.out.println("!!result value 1!! = " + i[1]);
//            }
        }


        return result.toArray(new int [people.length][]);
    }


}
