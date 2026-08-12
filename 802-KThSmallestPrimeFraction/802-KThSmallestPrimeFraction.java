// Last updated: 12/08/2026, 11:46:07
import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> arr[a[0]] * arr[b[1]] - arr[b[0]] * arr[a[1]]
        );

        // Initialize heap with fractions arr[0]/arr[j]
        for (int j = 1; j < n; j++) {
            pq.offer(new int[]{0, j});
        }

        // Pop k-1 smallest fractions
        for (int count = 0; count < k - 1; count++) {
            int[] frac = pq.poll();
            int i = frac[0], j = frac[1];
            if (i + 1 < j) {
                pq.offer(new int[]{i + 1, j});
            }
        }

        int[] result = pq.poll();
        return new int[]{arr[result[0]], arr[result[1]]};
    }
}
