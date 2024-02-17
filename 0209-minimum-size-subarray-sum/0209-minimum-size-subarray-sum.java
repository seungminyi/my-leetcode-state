class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int window = 0;
        int start = 0;
        int result = 0;
        for(int end = 0; end < nums.length; end++) {
            window += nums[end];
            while(window >= target) {
                if(result == 0 || result > end - start + 1) {
                    result = end - start + 1;
                }
                window -= nums[start++];
            }
        }
        
        return result;
    }
}