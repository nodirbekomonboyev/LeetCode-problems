package year2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1268 {

    // https://leetcode.com/problems/search-suggestions-system/description

    public static void main(String[] args) {

    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<List<String>>();

        for (int i = 1; i <= searchWord.length(); i++) {
            String prefix = searchWord.substring(0, i);
            List<String> matches = new ArrayList<>();

            for (String product : products) {
                if (product.startsWith(prefix)) {
                    matches.add(product);
                    if (matches.size() == 3) {
                        break;
                    }
                }
            }
            result.add(matches);
        }
        return result;
    }

}
