package com.greedy;

/*
6.26.21
122. Best Time to Buy and Sell Stock II
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class E122_BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {


        int maxProfit = 0;

        /**
         * Since SELL need to be after BUY
         * calculate the sum from SELL i with BUY i-1 from index 1
         *
         * from index 1 is because you can sell on 1st day
         */

        for(int i = 1; i < prices.length ; i ++ ){

          if(prices[i] > prices[i-1]){

              maxProfit = maxProfit + prices[i] - prices[i-1];
          }

        }
        return maxProfit;
    }

}
