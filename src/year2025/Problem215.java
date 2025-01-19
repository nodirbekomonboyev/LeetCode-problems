package year2025;

public class Problem215 {

    // https://leetcode.com/problems/kth-largest-element-in-an-array/description

    public static void main(String[] args) {

    }

    public int findKthLargest(int[] nums, int k) {
        int[] count = new int[20001];

        for (int num : nums) {
            count[num + 1000]++;
        }

        for (int i = count.length - 1; i >= 0; i--) {
            k -= count[i];
            if(k == 0) return count[i - 1000];
        }
        return -1;
    }

}
