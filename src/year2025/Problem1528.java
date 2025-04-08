package year2025;

import java.util.HashMap;
import java.util.Map;

public class Problem1528 {

    // https://leetcode.com/problems/shuffle-string/

    public String restoreString(String s, int[] indices) {
        char[] c=new char[(s.length())];
        for(int i=0;i<s.length();i++){
            c[indices[i]]=s.charAt(i);
        }
        return new String(c);
    }
}
