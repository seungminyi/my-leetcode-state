class Solution {
    public int hIndex(int[] citations) {
        citations = Arrays.stream(citations).boxed()
                     .sorted(Collections.reverseOrder())
                     .mapToInt(Integer::intValue)
                     .toArray();
        int result = 0;
        int left = 0;
        int right = citations.length -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(citations[mid] >= mid+1) {
                result = mid+1;
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        
        return result;
    }
}