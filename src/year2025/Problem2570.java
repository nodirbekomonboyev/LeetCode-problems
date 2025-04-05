package year2025;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem2570 {

    // https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> ids = new HashMap<>();
        for (int[] i : nums1) {
            ids.put(i[0], i[1]);
        }
        for (int[] i : nums2) {
            int key = i[0];
            if(ids.containsKey(key)){
                ids.replace(key, ids.get(key) + i[1]);
            } else {
              ids.put(i[0], i[1]);
            }
        }
        int[][] result = new int[ids.values().size()][2];

        for (int i = 1, j = 0; i <= 1000; i++) {
            if(ids.containsKey(i)){
                result[j] = new int[]{i, ids.get(i)};
                j++;
            }
        }
        return result;
    }
}
