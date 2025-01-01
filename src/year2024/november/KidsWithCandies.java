package year2024.november;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int candy : candies) {
            if(candy > max){
                max = candy;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if(max <= candy + extraCandies){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
