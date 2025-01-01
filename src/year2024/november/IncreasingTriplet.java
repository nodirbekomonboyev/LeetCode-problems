package year2024.november;

public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int point = 0;
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            last = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if(last < nums[j]){
                    point++;
                    last = nums[j];
                }
                if(point == 2){
                    return true;
                }
            }
        }
        return false;
    }
}
