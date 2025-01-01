package year2024.september;

import java.util.List;

public class IsAcronym {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder str = new StringBuilder();
        for (String word : words) {
            str.append(word.charAt(0));
        }
        return str.toString().equals(s);
    }
}
