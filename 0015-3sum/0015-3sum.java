class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++) {
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            int left = i+1;
            int right = nums.length - 1;
            while(left < right) {
                int temp = nums[i] + nums[left] + nums[right];
                if(temp == 0) {
                    List<Integer> answer = new ArrayList();
                    answer.add(nums[i]);
                    answer.add(nums[left]);
                    answer.add(nums[right]);
                    result.add(answer);
                    left++;
                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                }
                
                if(temp > 0) {
                    right--;
                }
                
                if(temp < 0) {
                    left++;
                }
            }
        }
        return result;
    }
}