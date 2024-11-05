package october;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(difference(nums1, nums2));
        ans.add(difference(nums2, nums1));
        return ans;
    }
    List<Integer> difference(int[] nums1, int[] nums2){
        Set<Integer> difference = new HashSet<>();
        for (int i : nums1) {
            boolean check = true;
            for (int j : nums2) {
                if(i == j){
                    check = false;
                }
            }
            if(check) difference.add(i);
        }
        return new ArrayList<>(difference);
    }
}
