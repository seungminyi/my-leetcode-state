class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet();
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                char number = board[i][j];
                if(number != '.') {
                    if (!set.add(number + " row " + i) ||
                        !set.add(number + " column " + j) ||
                        !set.add(number + " group " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}