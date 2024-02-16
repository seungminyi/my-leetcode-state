class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int max = 0;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if((long)mid * mid > (long)x) {
                right = mid -1;
            }else{
                max = mid;
                left = mid + 1;
            }
        }
        
        return max;
    }
}