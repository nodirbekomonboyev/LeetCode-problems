package arpil;

public class BitwiseComplement {
    public int bitwiseComplement(int n) {
        String binary = toBinary(n);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '0'){
                str.append(1);
            } else {
                str.append(0);
            }
        }
        return Integer.valueOf(str.toString(),2);
    }

    public String toBinary(int a){
        StringBuilder str = new StringBuilder();
        while (a >= 2){
            str.append(a % 2);
            a = a / 2;
        }
        str.append(a);
        return str.reverse().toString();
    }
}
