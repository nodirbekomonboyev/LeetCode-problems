package year2025;

public class Problem2114 {

    // https://leetcode.com/problems/maximum-number-of-words-found-in-sentences

    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for (String sentence : sentences) {
            int i = 1;
            for (char c : sentence.toCharArray()) {
                if(c == ' '){
                    i++;
                }
            }
            result = Math.max(result, i);
        }
        return result;
    }
}
