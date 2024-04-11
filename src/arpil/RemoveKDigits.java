package arpil;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        StringBuilder str = new StringBuilder(num);
        int n = 0;
        for (int i = 0; i < k;) {
            if(n + 1 < str.length()) {
                if (str.charAt(n) <= str.charAt(n + 1)) {
                    n++;
                } else {
                    str.deleteCharAt(n);
                    if (n > 0) {
                        n--;
                    }
                    i++;
                }
            }else {
                str.deleteCharAt(n--);
                i++;
            }
        }
        while (str.length() > 1){
            if(str.charAt(0) == '0'){
                str.deleteCharAt(0);
            } else {
                break;
            }
        }
        if(str.length() == 0) return "0";
        return str.toString();
    }
}
