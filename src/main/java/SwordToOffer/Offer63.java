package SwordToOffer;

public class Offer63 {

	private static int getOnceMaxEquity(int[] prices) {
		int equity = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			int restMaxItem = getMaxItem(prices, i + 1);
			int possibleMaxEquity = Math.max(0, restMaxItem - prices[i]);
			equity = Math.max(equity, possibleMaxEquity);
		}
		return equity;
	}

	private static int getMaxItem(int[] prices, int n) {
		int maxItem = 0;
		for (int j = n; j < prices.length; j++) {
			maxItem = Math.max(maxItem, prices[j]);
		}
		return maxItem;
	}

	public static int getOnceMaxEquity2(int[] prices) {

		int historyDeep = Integer.MAX_VALUE;
		int profit = Integer.MIN_VALUE;

		for (int i = 0; i < prices.length; i++) {
			historyDeep = Math.min(historyDeep, prices[i]);
			profit = Math.max(profit, prices[i] - historyDeep);
		}

		return profit;
	}

}
