package year2025;

import java.util.ArrayList;
import java.util.List;

public class Problem216 {

    // https://leetcode.com/problems/combination-sum-iii/description

    public static void main(String[] args) {

    }

    public void solve(int idx, int sum, int k, int n, List<Integer> cur, List<List<Integer>> ans) {
        if (cur.size() == k) {
            if (sum == n) ans.add(new ArrayList<>(cur));
            return;
        }
        for (int i = idx; i <= 9; i++) {
            if (sum + i > n) break;
            cur.add(i);
            solve(i + 1, sum + i, k, n, cur, ans);
            cur.remove(cur.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solve(1, 0, k, n, current, ans);
        return ans;
    }

}
