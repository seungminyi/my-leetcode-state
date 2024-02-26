class Solution {
    public int jump(int[] nums) {
        int left = 0;
        int right = 0;
        int count = 0;
        while(right < nums.length -1) {
            int farthest = 0;
            for(int i = left; i <= right; i++) {
                farthest = Math.max(farthest, nums[i] + i);
            }
            left = right+1;
            right = farthest;
            count++;
        }
        
        return count;
    }
}