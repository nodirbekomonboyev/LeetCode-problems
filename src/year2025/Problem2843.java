package year2025;

public class Problem2843 {

    // https://leetcode.com/problems/count-symmetric-integers/

    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if(9 < i && i < 100 && i % 10 == i / 10){
                count++;
            } else if(999 < i){
                int temp = i, begin = 0, end = 0;
                end += temp % 10;
                temp /= 10;
                end += temp % 10;
                temp /= 10;
                begin += temp % 10;
                temp /= 10;
                begin += temp;
                if(begin == end){
                    count++;
                }
            }
        }
        return count;
    }
}
