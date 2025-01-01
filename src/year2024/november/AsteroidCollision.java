package year2024.november;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> positive = new Stack<>();
        Stack<Integer> negative = new Stack<>();
        for (int asteroid : asteroids) {
            if(asteroid < 0){
                if(positive.isEmpty()){
                    negative.push(asteroid);
                } else {
                    while (true){
                        int i = positive.pop();
                        if(i > -asteroid){
                            positive.push(i);
                            break;
                        } else if(i < -asteroid && positive.size() == 0) {
                            negative.push(asteroid);
                            break;
                        } else if(i == -asteroid){
                            break;
                        }
                    }
                }
            } else {
                positive.push(asteroid);
            }
        }
        int[] ans = new int[negative.size() + positive.size()];
        int i = 0;
        for (Integer integer : negative) {
            ans[i] = integer;
            i++;
        }
        for (Integer integer : positive) {
            ans[i] = integer;
            i++;
        }
        return ans;
    }
}
