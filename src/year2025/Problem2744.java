package year2025;

public class Problem2744 {

    // https://leetcode.com/problems/find-maximum-number-of-string-pairs/

    public int maximumNumberOfStringPairs(String[] words) {
        int res = 0, length = words.length;
        for (int i = 0; i < length; i++) {
            StringBuilder reverse = new StringBuilder(words[i]).reverse();
            for (int j = i + 1; j < length; j++) {
                if(reverse.toString().equals(words[j])){
                    res++;
                }
            }
        }
        return res;
    }
}
