// Last updated: 12/08/2026, 11:44:21

import java.util.*;

class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n = nums.length;
        
        long total = 0;
        for (int i = n - 1; i >= n - k; i--) {
            if (mul > 0) {
                total += (long) nums[i] * mul;
            } else {
                total += nums[i];
            }
            mul--;
        }
        return total;
    }
}

