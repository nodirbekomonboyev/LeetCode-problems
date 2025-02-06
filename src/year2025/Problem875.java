package year2025;

public class Problem875 {

    // https://leetcode.com/problems/koko-eating-bananas/description

    public int max(int[] arr) {
        // Helper function to find the maximum element in the array
        int m = -1;
        for (int i = 0; i < arr.length; i++) {
            if (m < arr[i]) {
                m = arr[i];
            }
        }
        return m;
    }

    public int minEatingSpeed(int[] piles, int h) {
        // Binary search for the minimum eating speed
        int n = max(piles); // Maximum number of bananas in a single pile
        int l = 1;          // Minimum possible eating speed
        int r = n;          // Maximum possible eating speed
        int ans = Integer.MAX_VALUE;

        while (l <= r) {
            long hr = 0; // Total hours required with the current mid
            int mid = (l + r) / 2;

            // Calculate hours needed for the current eating speed
            for (int i = 0; i < piles.length; i++) {
                hr += (long) (piles[i] + mid - 1) / mid; // Avoid overflow
            }

            if (hr <= h) {
                // If Koko can finish within h hours, update the answer
                ans = Math.min(ans, mid);
                r = mid - 1; // Search for a smaller eating speed
            } else {
                l = mid + 1; // Search for a larger eating speed
            }
        }

        return ans; // Return the minimum valid eating speed
    }
}