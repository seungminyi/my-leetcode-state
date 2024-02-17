class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;
        
        int temp = nums[0];
        int slow = 1;
        int fast = 1;
        int count = 1;
        
        while(fast < nums.length) {
            nums[slow] = nums[fast];
            
            if(nums[fast] == temp){
                count++;
            }else{
                temp = nums[fast];
                count = 1;
            }
            
            if(count <= 2) {
                slow++;
            }
            fast++;
        }
        
        return slow;
    }
}