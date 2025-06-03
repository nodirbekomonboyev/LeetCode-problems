package year2025;

import java.util.ArrayList;
import java.util.List;

public class Problem1823 {

    public static void main(String[] args) {
        Problem1823 problem1823 = new Problem1823();
        System.out.println("problem1823.findTheWinner(5, 2) = " + problem1823.findTheWinner(5, 2));
    }

    // https://leetcode.com/problems/find-the-winner-of-the-circular-game/

    public int findTheWinner(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        int index = k - 1;
        while(n > 1){
            nums.remove(index);
            index = nextIndex(--index, k, --n);
        }
        return nums.get(0);
    }

    public int nextIndex(int i, int k, int size){
        if(i + k < size){
            return i + k;
        } else {
            return (i + k) % size;
        }
    }

}
