package Leetcode;

public class No122 {

	private int getMultipleMaxEquity(int[] prices) {

		int profit = 0;

		for (int i = 1; i < prices.length; i++) {
			int possibleProfit = prices[i] - prices[i - 1];
			if (possibleProfit <= 0) {
				continue;
			}
			profit += possibleProfit;
		}

		return profit;

	}
}
