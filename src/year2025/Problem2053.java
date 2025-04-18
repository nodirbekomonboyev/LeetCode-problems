package year2025;

import java.util.HashMap;
import java.util.Map;

public class Problem2053 {

    // https://leetcode.com/problems/kth-distinct-string-in-an-array/

    public static void main(String[] args) {
        String[] map  = new String[]{"b", "a", "c", "a"};

        Problem2053 problem2053 = new Problem2053();
        System.out.println("problem2053.kthDistinct(map ,2) = " + problem2053.kthDistinct(map, 2));
    }

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> counts = new HashMap<>();
        for (String s : arr) {
            if(counts.containsKey(s)){
                counts.replace(s, counts.get(s) + 1);
            } else {
                counts.put(s, 1);
            }
        }
        int i = 0;
        for (String s : arr) {
            if(counts.get(s) == 1){
                i++;
            }
            if(i == k){
                return s;
            }
        }
        return "";
    }
}
