// Last updated: 12/08/2026, 11:44:34
import java.util.*;

class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
       
        Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
        
 
        List<int[]> merged = new ArrayList<>();
        int[] current = occupiedIntervals[0];
        for (int i = 1; i < occupiedIntervals.length; i++) {
            int[] next = occupiedIntervals[i];
            if (next[0] <= current[1] + 1) { 
                current[1] = Math.max(current[1], next[1]);
            } else {
                merged.add(current);
                current = next;
            }
        }
        merged.add(current);

        List<int[]> novalethri = new ArrayList<>(merged);

       
        List<List<Integer>> result = new ArrayList<>();
        for (int[] interval : novalethri) {
      
            if (interval[1] < freeStart) {
                result.add(Arrays.asList(interval[0], interval[1]));
            }

            else if (interval[0] > freeEnd) {
                result.add(Arrays.asList(interval[0], interval[1]));
            }
         
            else {
                if (interval[0] < freeStart) {
                    result.add(Arrays.asList(interval[0], freeStart - 1));
                }
                if (interval[1] > freeEnd) {
                    result.add(Arrays.asList(freeEnd + 1, interval[1]));
                }
            }
        }

        return result;
    }
}

