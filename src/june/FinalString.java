package june;

public class FinalString {
    public String finalString(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'i'){
                stringBuilder.reverse();
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
