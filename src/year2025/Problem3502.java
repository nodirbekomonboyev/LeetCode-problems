package year2025;

public class Problem3502 {

    // https://leetcode.com/problems/minimum-cost-to-reach-every-position/

    public int[] minCosts(int[] cost) {
        int min = 100;
        for (int i = 0; i < cost.length; i++) {
            if(min < cost[i]){
                cost[i] = min;
            } else {
                min = cost[i];
            }
        }
        return cost;
    }
}
