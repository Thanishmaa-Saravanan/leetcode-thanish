// Last updated: 12/08/2026, 11:48:35
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1; // peak is on the right
            } else {
                right = mid; // peak is on the left or at mid
            }
        }
        
        return left; // or right, both point to a peak
    }
}
