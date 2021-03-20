package com;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

/*
121. Best Time to Buy and Sell Stock
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BuyAndSellStock_121 {


    public int maxProfit(int[] prices) {
        // using two for loop is too slow
        /*
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int value = prices[j] - prices[i];
                if (value > max) {
                    max = value;
                }
            }
        }
        System.out.println("max = " + max);
        return max;*/
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length;i++){
            if(prices[i]<min){  // get the value for min buy in array
                min = prices[i];
            }else if (prices[i]-min>max){ // if the largest sell - min buy is greater than current max
                max = prices[i] - min;
            }
        }
        System.out.println("max = " + max);


        return max;

    }

    }
