import year2024.july.GetConcatenation;
import year2024.june.HammingWeight;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList arr  = new ArrayList();
        GetConcatenation df = new GetConcatenation();
        HammingWeight sf = new HammingWeight();
        arr.add(df);
        arr.add(sf);
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        LinkedList<String> dfy = new LinkedList<>();

    }

    static int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b % a, a);
    }
}