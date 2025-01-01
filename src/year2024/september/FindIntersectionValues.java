package year2024.september;

import java.util.HashSet;

public class FindIntersectionValues {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int[] ans = new int[2];
        int count1 = 0, count2 = 0;

        for (int i : nums1){
            set1.add(i);
        }
        for (int i : nums2){
            set2.add(i);
            if(set1.contains(i)){
                count2++;
            }
        }
        for (int i : nums1){
            if (set2.contains(i)){
                count1++;
            }
        }
        ans[0] = count1;
        ans[1] = count2;
        return ans;
    }
}
