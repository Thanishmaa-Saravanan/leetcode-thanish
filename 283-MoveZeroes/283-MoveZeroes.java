// Last updated: 12/08/2026, 11:47:26
class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        
        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        
        // Fill remaining positions with zeroes
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}

