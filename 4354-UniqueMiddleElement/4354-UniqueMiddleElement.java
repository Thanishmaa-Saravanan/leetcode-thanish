// Last updated: 12/08/2026, 11:44:23
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int middle = nums[n/2];
        int count = 0;

        for(int num : nums){
            if(num == middle){
                count++;
            }
        }
        return count == 1;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3};
        int[] nums2 = {1,2,2};

        System.out.println(nums1);
        System.out.println(nums2);
    }
}