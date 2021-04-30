package com.math;

import java.math.BigDecimal;
import java.util.ArrayList;

/*
172. Factorial Trailing Zeroes
https://leetcode.com/problems/factorial-trailing-zeroes/
 */
public class FactorialTrailingZeros_172 {

    /**
     * The trailing zeros are come from 2x5
     * number of 2's are more than number of 5's
     * so we count how many 5's as factor
     *
     * for n = 25, since 25 = 5x5, we also need to add that
     *
     */


    public int trailingZeroes(int n) {
        int numberOfFives = 0;

        while(n>=5){
            numberOfFives = numberOfFives + Math.floorDiv(n,5);

            n = Math.floorDiv(n,5);

        }

        return numberOfFives;


    }
}
