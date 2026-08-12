// Last updated: 12/08/2026, 11:44:18
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum = 0;

        for(int num:nums){
            int temp = num;
            int maxDigit = 0;
            int minDigit = 9;

            if(temp == 0){
                maxDigit =  0;
                minDigit = 0;
            }
            while(temp>0){
                int digit = temp %10;
                maxDigit = Math.max(maxDigit,digit);
                minDigit = Math.min(minDigit,digit);
                temp /= 10;   
            }
            int range = maxDigit - minDigit;
            
            if(range > maxRange){
                maxRange = range;
            }
        }
        for(int num:nums){
            int temp = num;
            int maxDigit = 0;
            int minDigit = 9;

            if(temp ==0){
                maxDigit = 0;
                minDigit = 0;
            }
            while(temp>0){
                int digit = temp%10;
                maxDigit = Math.max(maxDigit,digit);
                minDigit = Math.min(minDigit,digit);
                temp /= 10;
            }
            if((maxDigit - minDigit) == maxRange){
                sum += num;
            }       
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums1 = {5724, 111, 350};
        System.out.println(nums1);
        int[] nums2 = {90, 900};
        System.out.println(nums2);
    }
    
}