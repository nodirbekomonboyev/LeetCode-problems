package year2024.november;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            n--;
        }
        int length = flowerbed.length;
        for (int i = 1; i < length - 1 && n != 0; i++) {
             if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        if(length > 2 && flowerbed[length - 2] == 0 && flowerbed[length - 1] == 0){
            flowerbed[length - 1] = 1;
            n--;
        }
        return n < 1;
    }
}
