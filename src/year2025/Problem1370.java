package year2025;

public class Problem1370 {
    // https://leetcode.com/problems/increasing-decreasing-string/

    public String sortString(String s) {
        int[] n=new int[26];
        for(char ch:s.toCharArray()) {
            n[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        while(sb.length()!=s.length()) {
            for(int i=0;i<26;i++) {
                if(n[i]!=0) {
                    sb.append((char)(i+'a'));
                    n[i]--;
                }
            }
            for(int i=25;i>=0;i--) {
                if(n[i]!=0) {
                    sb.append((char)(i+'a'));
                    n[i]--;
                }
            }
        }
        return sb.toString();
    }
}
