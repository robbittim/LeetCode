package com.greedy;

public class E605_CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        /*
        6.26.21
        605. Can Place Flowers
        https://leetcode.com/problems/can-place-flowers/
         */

        int i = 0;
        int count = 0;

        while (i < flowerbed.length) {

            /**
             *  When i = 0 , we check if both of its adjacent positions are also 0,
             *      true then we can plant a flower ( i become 1)
             *      false then move to next index
             *
             *  For the first and last elements,
             *  we need not check the previous and the next adjacent positions respectively.
             */
            if (flowerbed[i] == 0
                    && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

                flowerbed[i] = 1;
                count++;
            }
            i ++;
        } // end while

        boolean ans = count>=n;

        return ans;
    }


}
