package june;

public class CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        int[] point = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            point[sentence.charAt(i) - 'a']++;
        }
        for (int i : point) {
            if (i < 1){
                return false;
            }
        }
        return true;
    }
}
