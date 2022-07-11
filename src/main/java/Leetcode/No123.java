package Leetcode;

public class No123 {
	public static void main(String[] args) {
		int[] prices = new int[] { 100, 80, 120, 130, 70, 60, 100, 125 };

		System.out.println(getBuy2TimeMaxEquity(prices));

	}

	private static int getBuy2TimeMaxEquity(int[] prices) {

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
