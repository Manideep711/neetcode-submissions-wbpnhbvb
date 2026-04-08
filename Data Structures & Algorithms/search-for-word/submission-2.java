class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(dfs(i, j, 0, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int row, int col, int index, char[][] board, String word) {
        // ✅ Check bounds & match
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length 
           || board[row][col] != word.charAt(index)) {
            return false;
        }

        // ✅ If last character matched
        if(index == word.length() - 1) {
            return true;
        }

        // ✅ Mark visited
        char temp = board[row][col];
        board[row][col] = '#';

        // ✅ Explore all 4 directions
        boolean found = dfs(row+1, col, index+1, board, word) ||
                        dfs(row-1, col, index+1, board, word) ||
                        dfs(row, col+1, index+1, board, word) ||
                        dfs(row, col-1, index+1, board, word);

        // ✅ Backtrack
        board[row][col] = temp;

        return found;
    }
}