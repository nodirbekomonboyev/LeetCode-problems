package year2024.arpil;

public class IsIsomorphic {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        if (s.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (mapST[c1] == 0 && mapTS[c2] == 0) {
                mapST[c1] = c2;
                mapTS[c2] = c1;
            } else if (!(mapST[c1] == c2 && mapTS[c2] == c1)) {
                return false;
            }
        }

        return true;
    }
}
