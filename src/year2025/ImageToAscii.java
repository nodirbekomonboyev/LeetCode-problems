package year2025;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageToAscii {

    /***
     * Beauty is in the eyes of the Beholder perspective is key
     *
     */
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("C:/Users/Hp/Desktop/IMG_3231.JPEG"));
            int width = image.getWidth();
            int height = image.getHeight();

            for (int y = 0; y < height; y += 5) {
                for (int x = 0; x < width; x += 2) {
                    int pixel = image.getRGB(x, y);
                    int red = (pixel >> 16) & 0xff;
                    int green = (pixel >> 8) & 0xff;
                    int blue = pixel & 0xff;
                    int gray = (red + green + blue) / 3;

                    char c = grayToChar(gray);
                    System.out.print(c);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static char grayToChar(int gray) {
        char[] asciiChars = {'@', '#', '8', '&', 'o', ':', '*', '.', ' '};
        int index = gray * (asciiChars.length - 1) / 255;
        return asciiChars[index];
    }
}
