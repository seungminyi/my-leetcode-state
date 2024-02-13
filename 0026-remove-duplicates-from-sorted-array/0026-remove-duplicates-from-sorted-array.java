class Solution {
    public int removeDuplicates(int[] nums) {
        int val = -101;
        int pointer = 0;
        int result = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[pointer] = nums[i];
                val = nums[i];
                pointer++;
                result++;
            }
        }
        
        return result;
    }
}