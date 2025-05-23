package year2025;

public class Problem3516 {

    // https://leetcode.com/problems/find-closest-person/

    public int findClosest(int x, int y, int z) {
        x = Math.abs(z - x);
        y = Math.abs(z - y);
        if(x == y){
            z = 0;
        } else {
            z = (x > y)? 2 : 1;
        }
        return z;
    }
}
