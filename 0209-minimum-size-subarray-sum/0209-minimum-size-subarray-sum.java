class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums[0] >= target) return 1;
        
        int window = nums[0];
        int left = 0;
        int right = 0;
        int result = 0;
        
        while(left < nums.length && right < nums.length) {
            System.out.println(window);
            if(window < target) {
                right++;
                if(right < nums.length) {
                    window += nums[right];
                }
            }else{
                if(result == 0 || result > right - left + 1) {
                    result = right - left + 1;
                }
                window -= nums[left];
                left++;
            }
        }
        
        return result;
    }
}