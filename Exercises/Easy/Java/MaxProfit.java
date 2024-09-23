/*
 * LeetCode
 * 121. Best Time to Buy and Sell Stock
 */
package Exercises.Easy.Java;

import java.util.Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int max = maxProfit(prices);
        System.out.println(String.format("The max profit in %s is: %d", Arrays.toString(prices), max));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        int sell = 1;

        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                profit = Math.max(profit, prices[sell] - prices[buy]);
            } else {
                buy = sell;
            }
            sell++;
        }

        return profit;
    }
}