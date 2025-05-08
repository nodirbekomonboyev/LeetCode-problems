package year2025;

public class Problem3492 {

    // https://leetcode.com/problems/maximum-containers-on-a-ship/

    public int maxContainers(int n, int w, int maxWeight) {
        int cells=n*n;
        int weight=cells*w;
        int val=Math.min(weight,maxWeight);
        return val/w;
    }

}
