package arpil;

public class SquareIsWhite {
    public boolean squareIsWhite(String coordinates) {
        int i = coordinates.charAt(0) - 'a';
        int j = coordinates.charAt(1) - '0';
        return (i % 2 == 0) == (j % 2 == 0);
    }
}
