package year2024.arpil;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        String st = s + t;
        int ans = 0;
        for(char ch : st.toCharArray()) ans ^= ch;
        return (char) ans;
    }
}
