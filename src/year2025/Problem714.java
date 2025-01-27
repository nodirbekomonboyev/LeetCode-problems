package year2025;

public class Problem714 {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description

    public static void main(String[] args) {
        Problem714 problem714 = new Problem714();
        System.out.println("problem714.maxProfit(new int[]{1,3,2,8,4,9}, 2) = " + problem714.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
        System.out.println("problem714.maxProfit(new int[]{1,3,7,5,10,3}, 3) = " + problem714.maxProfit(new int[]{1,3,7,5,10,3}, 3));
    }


    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }
}
