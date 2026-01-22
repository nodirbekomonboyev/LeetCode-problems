package year2026;

public class Problem3794 {

    public static void main(String[] args) {
        Problem3794 problem3794 = new Problem3794();
        System.out.println("problem3794.reversePrefix(\"abcd\", 2) = " + problem3794.reversePrefix("abcd", 2));
        System.out.println("problem3794.reversePrefix(\"xyz\", 3) = " + problem3794.reversePrefix("xyz", 3));
        System.out.println("problem3794.reversePrefix(\"hey\", 2) = " + problem3794.reversePrefix("hey", 1));

    }

    public String reversePrefix(String s, int k) {
        StringBuilder str = new StringBuilder("");
        str.append(s, 0, k).reverse();
        return str.append(s.substring(k)).toString();
    }

}
