package september;

public class SortSentence {

    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] ans = new String[str.length];
        StringBuilder result = new StringBuilder();

        int i = 0;
        for (String item : str) {
            i = (int) (item.charAt(item.length() - 1) - '0');
            ans[i - 1] = item.substring(0, item.length() - 1);
        }

        for (i = 0 ; i < ans.length - 1 ; i++) {
            result.append(ans[i]).append(" ");
        }
        result.append(ans[i]);
        return result.toString();
    }

}
