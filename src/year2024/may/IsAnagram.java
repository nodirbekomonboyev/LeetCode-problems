package year2024.may;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < t.length(); i++) {
            a[s.charAt(i) - 'a']++;
            b[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
