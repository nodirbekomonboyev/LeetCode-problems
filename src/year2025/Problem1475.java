package year2025;

import java.util.Arrays;

public class Problem1475 {

    // https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/

    public static void main(String[] args) {
        int[] arr = new int[]{10,2,5,2,8};

        Problem1475 problem1475 = new Problem1475();
        System.out.println("problem1475.finalPrices(arr) = " + Arrays.toString(problem1475.finalPrices(arr)));
    }

    public int[] finalPrices(int[] prices) {
        int length = prices.length;;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if(prices[i] % prices[j] == 0){
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }

}
