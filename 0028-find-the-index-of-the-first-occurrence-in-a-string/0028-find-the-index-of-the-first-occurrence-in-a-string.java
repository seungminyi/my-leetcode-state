class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        
        int needleLength = needle.length();
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.length() >= i+needleLength && haystack.substring(i, i + needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}