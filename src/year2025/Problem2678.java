package year2025;

public class Problem2678 {

    // https://leetcode.com/problems/number-of-senior-citizens/

    public int countSeniors(String[] details) {
        int result = 0;
        for (String detail : details) {
            int i = Integer.parseInt(detail.substring(11, 13));
            if(i > 60){
                result++;
            }
        }
        return result;
    }
}
