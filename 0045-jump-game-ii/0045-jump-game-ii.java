class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int goal = nums.length -1;
        int max = nums.length -1;
        int count = 0;
        while(goal != 0) {
            for(int i = goal -1; i >= 0; i--) {
                if(nums[i] + i >= goal && i < max) {
                    max = i;
                }
            }
            goal = max;
            count++;
        }
        
        
        return count;
    }
}