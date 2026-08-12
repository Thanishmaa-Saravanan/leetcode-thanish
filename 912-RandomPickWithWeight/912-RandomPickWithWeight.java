// Last updated: 12/08/2026, 11:45:58
import java.util.*;

class Solution {
    private int[] prefixSums;
    private int totalSum;
    private Random rand;

    public Solution(int[] w) {
        prefixSums = new int[w.length];
        prefixSums[0] = w[0];
        for (int i = 1; i < w.length; i++) {
            prefixSums[i] = prefixSums[i - 1] + w[i];
        }
        totalSum = prefixSums[w.length - 1];
        rand = new Random();
    }

    public int pickIndex() {
        int target = rand.nextInt(totalSum) + 1; // random number in [1, totalSum]
        // Binary search
        int left = 0, right = prefixSums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefixSums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
