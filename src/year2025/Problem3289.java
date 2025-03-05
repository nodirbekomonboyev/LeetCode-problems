package year2025;

public class Problem3289 {

    // https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/

    public int[] getSneakyNumbers(int[] nums) {
        int[] point = new int[100];
        for (int num : nums) {
            point[num]++;
        }
        int[] temp = new int[100];
        int index = 0;
        for (int i = 0; i < point.length; i++) {
            if(point[i] > 1){
                temp[index] = i;
                index++;
            }
        }
        int[] res = new int[index];
        for (int i = 0; i < index; i++) {
            res[i] = temp[i];
        }
        return res;
    }
}
