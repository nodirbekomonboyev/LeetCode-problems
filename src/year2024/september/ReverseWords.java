package year2024.september;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder answer = new StringBuilder();
        int length = words.length;
        for (int i = 0 ; i < length - 1 ; i++) {
            StringBuilder a = new StringBuilder(words[i]);
            answer.append(a.reverse()).append(" ");
        }
        StringBuilder a = new StringBuilder(words[length - 1]);
        answer.append(a.reverse());
        return answer.toString();
    }
}
