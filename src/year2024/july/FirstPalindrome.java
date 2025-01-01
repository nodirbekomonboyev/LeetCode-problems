package year2024.july;

public class FirstPalindrome {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }
    public boolean isPalindrome(String s){
        int size = s.length();
        for (int i = 0; i < size / 2; i++) {
            if(s.charAt(i) != s.charAt(size - i - 1)){
                return false;
            }
        }
        return true;
    }
}
