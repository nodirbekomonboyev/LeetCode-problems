package december;

public class MaxVowels {
    public int maxVowels(String s, int k) {
        String vowels = "AaIiEeOoUu";
        int result = 0;
        int temp = 0;
        int start = 0;
        int end = 0;
        char[] chars = s.toCharArray();
        while (end < chars.length){
            if (vowels.indexOf(chars[end]) != -1) {
                temp++;
            }
            if(end -  start + 1 >= k){
                start++;
                if (vowels.indexOf(chars[start - 1]) != -1) {
                    temp--;
                }
            }
            end++;
            result = Math.max(temp, result);
        }
        return result;
    }
}
