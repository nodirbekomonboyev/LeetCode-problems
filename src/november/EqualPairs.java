package november;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EqualPairs {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> rowPairs = new HashMap<>();
        for (int[] ints : grid) {
            String s = Arrays.toString(ints);
            if(rowPairs.containsKey(s)){
                rowPairs.put(s, rowPairs.get(s) + 1);
            } else {
                rowPairs.put(s, 1);
            }
        }
        Map<String, Integer> colPairs = new HashMap<>();
        for (int i = 0 ; i < grid.length ; i++) {
            StringBuilder s = new StringBuilder();
            s.append("[");
            for (int j = 0 ; j < grid[i].length ; j++) {
                if(j != grid[i].length - 1){
                    s.append(grid[j][i]).append(", ");
                } else {
                    s.append(grid[j][i]);
                }
            }
            s.append("]");
            String str = s.toString();
            if(colPairs.containsKey(str)){
                colPairs.put(str, colPairs.get(str) + 1);
            } else {
                colPairs.put(str, 1);
            }
        }
        int result = 0;

        for (String s : rowPairs.keySet()) {
            if(colPairs.containsKey(s)){
                result += colPairs.get(s) * rowPairs.get(s);
            }
        }
        return result;
    }
}
