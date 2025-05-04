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
        Stack<Integer> st=new Stack();

        for(int i=n-1; i>=0; i--){
            // Remove elements from the stack that are greater than the current price
            while(!st.isEmpty() && st.peek()>prices[i]){
                st.pop();
            }

            // Get the discount from the stack or 0 if no valid discount
            int discount=st.isEmpty()?0:st.peek();

            // Push the original value before updating
            st.push(prices[i]);

            // Update the current price with the discount
            prices[i]-=discount;
        }

        return prices;
    }
}
