class Solution {
    public boolean exist(char[][] board, String word) {
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(dfs(0,i,j,board,word)){
                return true;
            }
        }
       }
       return false;
    }
    public boolean dfs(int index,int row,int column,char[][] board, String word){
        int m=board.length;
        int n=board[0].length;
         if(index==word.length()){
            return true;
        }
        if(row<0 || row>=m ||column<0 || column>=n ||board[row][column]!=word.charAt(index)){
            return false; 
        }
          char temp=board[row][column];
          board[row][column]='#';
        boolean left=dfs(index+1,row-1,column,board,word);
        boolean right=dfs(index+1,row+1,column,board,word);
        boolean up=dfs(index+1,row,column+1,board,word);
        boolean down=dfs(index+1,row,column-1,board,word);
        board[row][column]=temp;
        return left || right || up || down;

    }
}
