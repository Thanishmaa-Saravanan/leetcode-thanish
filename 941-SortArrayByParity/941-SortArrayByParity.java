// Last updated: 12/08/2026, 11:45:48
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                // swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            
            if (nums[left] % 2 == 0) left++;
            if (nums[right] % 2 == 1) right--;
        }
        
        return nums;
    }
}


