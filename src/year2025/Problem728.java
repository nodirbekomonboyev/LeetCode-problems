package year2025;

import java.util.ArrayList;
import java.util.List;

public class Problem728 {


    public static void main(String[] args) {
        Problem728 problem728 = new Problem728();
        System.out.println("problem728.selfDividingNumbers(1, 22) = " + problem728.selfDividingNumbers(1, 22));
    }

    // https://leetcode.com/problems/self-dividing-numbers/

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp = i;
            boolean check = true;
            while (temp > 0){
                int k = temp % 10;
                if(k > 0){
                    if(i % k != 0){
                        check = false;
                        break;
                    } else {
                        temp /= 10;
                    }
                } else {
                    check = false;
                    break;
                }
            }
            if(check){
                result.add(i);
            }
        }
        return result;
    }
}
