package year2025;

public class Problem1588 {
    // https://leetcode.com/problems/sum-of-all-odd-length-subarrays/

    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length, sum = 0;
        for (int left = 0; left < n; left++) {
            int iSum = 0;
            for (int right = left; right < n; right++) {
                iSum += arr[right];
                sum += (right - left + 1) % 2 == 1 ? iSum : 0;
            }
        }
        return sum;
    }
}
