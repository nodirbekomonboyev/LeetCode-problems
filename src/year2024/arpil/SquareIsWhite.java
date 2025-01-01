package year2024.arpil;
public class SquareIsWhite {
    public static boolean squareIsWhite(String coordinates) {
        int i = coordinates.charAt(0) - 'a';
        int j = coordinates.charAt(1) - '0';
        return (i % 2 == 0) == (j % 2 == 0);
    }
}
