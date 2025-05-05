package year2025;

import java.util.Arrays;
import java.util.Stack;

public class Problem1475 {

    // https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/

    public static void main(String[] args) {
        int[] arr = new int[]{10,2,5,2,8};

        Problem1475 problem1475 = new Problem1475();
        System.out.println("problem1475.finalPrices(arr) = " + Arrays.toString(problem1475.finalPrices(arr)));
    }

    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        for(int i = 0; i < prices.length; i++){
            prices[i] = getDiscount(prices, i, n);
        }
        return prices;
    }
    int getDiscount(int[] prices, int i, int n){
        for(int j=i+1; j<n; j++){
            if(prices[j]<=prices[i]){
                return prices[i]-prices[j];
            }
        }

        return prices[i];
    }
}
