package year2024.june;

import java.util.ArrayList;
import java.util.List;

public class CellsInRange {
    public List<String> cellsInRange(String s) {
        int begin = s.charAt(0);
        int end = s.charAt(3);
        int bIndex = Integer.parseInt(s.substring(1,2));
        int eIndex = Integer.parseInt(s.substring(4));
        List<String> ans = new ArrayList<>();
        for(int j = begin; j <= end ; j++){
            for (int i = bIndex ; i <= eIndex ; i++){
                String str = String.valueOf((char) (j)) + i;
                ans.add(str);
            }
        }
        return ans;
    }
}
