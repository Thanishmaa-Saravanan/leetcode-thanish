// Last updated: 12/08/2026, 11:45:45
import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int card : deck) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        int gcd = 0;
        for (int count : countMap.values()) {
            gcd = gcd(gcd, count);
        }

        return gcd > 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
