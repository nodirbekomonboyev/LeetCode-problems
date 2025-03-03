package year2025;

public class Problem2011 {

    // https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

    public static void main(String[] args) {
        String[] strs = new String[]{"--X","X++","X++"};
        Problem2011 problem2011 = new Problem2011();
        System.out.println("problem2011.finalValueAfterOperations(strs) = " + problem2011.finalValueAfterOperations(strs));
    }

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if(operation.charAt(1) == '+'){
                result++;
            } else {
                result--;
            }
        }
        return result;
    }
}
