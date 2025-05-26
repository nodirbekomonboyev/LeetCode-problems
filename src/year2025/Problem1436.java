package year2025;

import java.util.ArrayList;
import java.util.List;

public class Problem1436 {
    
    // https://leetcode.com/problems/destination-city/

    public String destCity(List<List<String>> paths) {
        List<String> list = new ArrayList<>();
        for (List<String> path : paths) {
            list.add(path.get(1));
        }
        for (List<String> path : paths) {
            list.remove(path.get(0));
        }
        return list.get(0);
    }
    
}
