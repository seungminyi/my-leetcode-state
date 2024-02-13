class Solution {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        int pointer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                
            }else{
                nums[pointer] = nums[i];
                pointer++;
                result++;
            }
        }
        
        return result;
    }
}