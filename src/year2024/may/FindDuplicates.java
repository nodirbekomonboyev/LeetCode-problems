package year2024.may;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        boolean[] val = new boolean[nums.length];
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(val[nums[i] - 1]){
                ans.add(nums[i]);
            }
            val[nums[i] - 1] = true;
        }
        return ans;
    }
}
