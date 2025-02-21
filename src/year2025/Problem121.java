package year2025;

public class Problem121 {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock

    public int maxProfit(int[] prices) {
        int maxProfit = 0, buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] - buy > maxProfit){
                maxProfit = prices[i] - buy;
            }
            if(buy > prices[i]){
                buy = prices[i];
            }
        }
        return maxProfit;
    }
}
