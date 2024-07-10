package july;

public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int[] ans = new int[size];
        for(int i = 0 ; i < size ; i++){
            if(i % 2 == 0){
                ans[i] = nums[i / 2];
            } else {
                ans[i] = nums[n];
                n++;
            }
        }
        return ans;
    }
}
