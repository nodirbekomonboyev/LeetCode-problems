package year2026;

import year2024.november.MaxArea;

public class Problem1837 {

    public static void main(String[] args) {
        Problem1837 problem1837 = new Problem1837();
        problem1837.sumBase(34, 6);

    }

    public int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0){
            sum += n % k;
            n /= k;
        }
        return sum;
    }

}
