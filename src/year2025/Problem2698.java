package year2025;

public class Problem2698 {

    // https://leetcode.com/problems/find-the-punishment-number-of-an-integer/

    public int punishmentNumber(int n) {
        int[] arr = {1,9,10,36,45,55,82,91,99,100,235,297,369,370,379,414,657,675,703,756,792,909,918,945,964,990,991,999,1000};
        int sum = 0;
        for (int j : arr) {
            if (j <= n) sum += j * j;
            else break;
        }
        return sum;
    }
}
