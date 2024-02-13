class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        boolean isFirst = true;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                isFirst = true;
            }else{
                if(isFirst) {
                    result = 1;
                    isFirst = false;
                }else{
                    result++;
                }
            }
        }
        
        return result;
    }
}