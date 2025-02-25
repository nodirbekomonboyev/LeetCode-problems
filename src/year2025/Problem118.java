package year2025;

import java.util.ArrayList;
import java.util.List;

public class Problem118 {

    // https://leetcode.com/problems/pascals-triangle/description

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item0 = new ArrayList<>();
        item0.add(1);
        result.add(item0);
        if (numRows == 1) return result;
        List<Integer> item1 = new ArrayList<>();
        item1.add(1);
        item1.add(1);
        result.add(item1);
        if (numRows == 2) return result;
        for (int i = 2; i < numRows; i++) {
            List<Integer> item = new ArrayList<>();
            item.add(1);
            List<Integer> last = result.get(i - 1);
            for (int j = 1; j < last.size(); j++) {
                item.add(j, last.get(j - 1) + last.get(j));
            }
            item.add(1);
            result.add(item);
        }
        return result;
    }
}
