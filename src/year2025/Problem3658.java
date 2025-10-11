package year2025;

public class Problem3658 {

    //https://leetcode.com/problems/gcd-of-odd-and-even-sums/

    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0, sumEven = 0;
        for (int i = 0; i < n; i++) {
            sumOdd += 2 * i + 1;
            sumEven += 2 * i + 2;
        }
        int min = Math.min(sumOdd, sumEven);
        for (int i = min; i > 0; i--) {
            if(sumOdd % i == 0 && sumEven % i == 0){
                return i;
            }
        }
        return 1;
    }
}
