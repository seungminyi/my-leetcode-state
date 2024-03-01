class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        int max = 0;
        
        for(int num : nums) {
            set.add(num);
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i] -1)) {
                int temp = nums[i];
                int count = 0;
                while(set.contains(temp)){
                    count++;
                    temp++;
                }
                
                max = Math.max(max, count);
            }
        }
        
        return max;
    }
}