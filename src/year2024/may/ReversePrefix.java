package year2024.may;

public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch) + 1;
        StringBuilder ans = new StringBuilder(word);
        if(index != 0){
            ans = new StringBuilder(word.substring(0, index));
            ans.reverse();
            ans.append(word.substring(index));
        }
        return ans.toString();
    }
}
