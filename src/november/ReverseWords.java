package november;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            String str = strings[i];
            if(!str.equals("") && !str.equals(" ")){
                if(i != strings.length - 1){
                    ans.append(" ");
                }
                ans.append(str);
            }
        }
        return ans.toString();
    }
}
