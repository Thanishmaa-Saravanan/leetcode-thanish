// Last updated: 12/08/2026, 11:44:59
import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(2 * num) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            seen.add(num);
        }
        
        return false;
    }
}

