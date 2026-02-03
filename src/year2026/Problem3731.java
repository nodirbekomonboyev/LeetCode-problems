package year2026;

import java.util.ArrayList;
import java.util.List;

public class Problem3731 {

    public List<Integer> findMissingElements(int[] nums) {
        int[] elements = new int[101];
        int max = 0, min = 101;
        for (int num : nums) {
            elements[num]++;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = min + 1; i < max; i++) {
            if(elements[i] != 1){
                result.add(i);
            }
        }
        return result;
    }
}
