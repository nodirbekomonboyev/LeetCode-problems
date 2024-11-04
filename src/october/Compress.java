package october;

public class Compress {
    public int compress(char[] chars) {
        int left = 0;
        int right = 0;
        int index = 0;
        int size = chars.length;
        while(right < size ){
            while(right < size && chars[right] == chars[left] ) {
                right++;
            }
            chars[index++] = chars[left];
            int num =  right - left;
            if (num > 1) {
                String count = Integer.toString(num);
                for (char c : count.toCharArray()) {
                    chars[index++] = c;
                }
            }
            left = right;

        }
        return index;
    }
}
