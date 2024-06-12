package june;

public class SortColors {

    public void sortColors(int[] nums) {
        int[] count = new int[300];
        for (int num : nums) {
            count[num]++;
        }
        int k = 0;
        for (int i = 0 ; i < count.length ; i++) {
            for (int j = 0; j < count[i]; j++) {
                nums[k] = i;
                k++;
            }
        }
    }
}
