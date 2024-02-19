class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int bottom = 0;
        int top = matrix.length -1;
        int row = 0;
        
        while(bottom <= top) {
            int mid = bottom + (top - bottom) / 2;
            if(matrix[mid][0] == target) {
                return true;
            }
            
            if(matrix[mid][0] > target) {
                top = mid -1;
            }else {
                bottom = mid + 1;
                row = mid;
            }
        }
        
        int left = 0;
        int right = matrix[0].length -1;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(matrix[row][mid] == target) {
                return true;
            }
            
            if(matrix[row][mid] > target) {
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }
}