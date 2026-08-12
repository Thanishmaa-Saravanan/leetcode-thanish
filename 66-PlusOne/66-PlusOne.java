// Last updated: 12/08/2026, 11:49:17
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits; // no carry, done
            }
            digits[i] = 0; // carry over
        }
        
        // If we reach here, all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
