package com.greedy;

/*
6.26.21
121. Best Time to Buy and Sell Stock
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class E121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        // Declare a left_min variable which have track of the minPrice values in the array we are traversing
        int minPrice = Integer.MAX_VALUE;
        // initialize profit variable with 0
        int maxProfit =0 ;


        for(int i =0;i<prices.length;i++){
        // If we find an element which is less than the minPrice element then we update it.
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            int tempProfit = prices[i] - minPrice;
            // If  we found the profit which is greater than the prev profit then we just update it.
             if (tempProfit > maxProfit){

                maxProfit = tempProfit;
            }


        }
            return maxProfit;
    }

}
