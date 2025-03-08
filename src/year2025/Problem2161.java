package year2025;

public class Problem2161 {

    // https://leetcode.com/problems/partition-array-according-to-given-pivot/

    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if(num < pivot){
                res[index] = num;
                index++;
            }
        }
        for (int num : nums) {
            if(num == pivot){
                res[index] = num;
                index++;
            }
        }
        for (int num : nums) {
            if(num > pivot){
                res[index] = num;
                index++;
            }
        }
        return res;
    }
}
