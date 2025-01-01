package year2024.july;

public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans  = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();
        int size = Math.max(l1, l2);
        for (int i = 0; i < size; i++) {
            if(i < l1){
                ans.append(word1.charAt(i));
            }
            if(i < l2){
                ans.append(word2.charAt(i));
            }
        }
        return ans.toString();
    }
}
