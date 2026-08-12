// Last updated: 12/08/2026, 11:44:56
import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> reservedMap = new HashMap<>();
        
        // Build reserved seats map
        for (int[] seat : reservedSeats) {
            reservedMap.computeIfAbsent(seat[0], k -> new HashSet<>()).add(seat[1]);
        }
        
        int result = 0;
        
        for (int row : reservedMap.keySet()) {
            Set<Integer> reserved = reservedMap.get(row);
            
            boolean left = !(reserved.contains(2) || reserved.contains(3) || reserved.contains(4) || reserved.contains(5));
            boolean middle = !(reserved.contains(4) || reserved.contains(5) || reserved.contains(6) || reserved.contains(7));
            boolean right = !(reserved.contains(6) || reserved.contains(7) || reserved.contains(8) || reserved.contains(9));
            
            if (left && right) {
                result += 2;
            } else if (left || middle || right) {
                result += 1;
            }
        }
        
       
        result += (n - reservedMap.size()) * 2;
        
        return result;
    }
}
