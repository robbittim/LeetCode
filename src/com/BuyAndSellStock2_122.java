package com;

import java.util.Arrays;

public class

    /*

    122. Best Time to Buy and Sell Stock II

    https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
     */
BuyAndSellStock2_122 {

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

        for(int i = 1; i<prices.length;i++) {

           if(prices[i]>prices[i-1]){
               max+=prices[i]-prices[i-1];
           }

        }
        System.out.println("max = " + max);


        return max;

    }
}
