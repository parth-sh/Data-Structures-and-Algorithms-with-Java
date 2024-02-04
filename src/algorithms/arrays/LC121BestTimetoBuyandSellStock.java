package algorithms.arrays;

import java.util.Scanner;

public class LC121BestTimetoBuyandSellStock {

	/*
	 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-
	 * plan-v2&envId=top-interview-150
	 * 
	 * You are given an array prices where prices[i] is the price of a given stock
	 * on the ith day.
	 * 
	 * You want to maximize your profit by choosing a single day to buy one stock
	 * and choosing a different day in the future to sell that stock.
	 * 
	 * Return the maximum profit you can achieve from this transaction. If you
	 * cannot achieve any profit, return 0.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int k = maxProfit(arr);
		System.out.println(k);
		scanner.close();
	}

	private static int maxProfit(int[] prices) {
		/*
		 * Brute Force Approach: Iterate with two nested loops. The outer loop 'i'
		 * represents the buying day, while the inner loop 'j' (starting from 'i+1')
		 * represents the selling day. Calculate the profit for each pair of days and
		 * track the maximum profit throughout. Return the maximum profit found.
		 * 
		 * Efficient Approach (DP on stocks): We will keep track of the minimum price in
		 * the past, and will take the todays price as initial price because it is not
		 * sold yet,
		 */
		int n = prices.length;
		int mini = prices[0];
		int profit = 0;
		for (int i = 1; i < n; i++) {
			int curr_profit = prices[i] - mini;
			if (profit < curr_profit) {
				profit = curr_profit;
			}
			if (prices[i] < mini) {
				mini = prices[i];
			}
		}
		return profit;
	}
}
