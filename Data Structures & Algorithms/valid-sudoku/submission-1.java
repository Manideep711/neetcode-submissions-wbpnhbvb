class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        HashSet<Character>[] rows=new HashSet[n];
         HashSet<Character>[] cols=new HashSet[n];
          HashSet<Character>[] boxs=new HashSet[n];
          for(int r=0;r<n;r++){
            rows[r]=new HashSet<Character>();
            cols[r]=new HashSet<Character>();
            boxs[r]=new HashSet<Character>();
          }
          for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                char val=board[r][c];
                if(val=='.'){
                    continue;
                }
                if(rows[r].contains(val)){
                    return false;
                }
                else{
                    rows[r].add(val);
                }
                if(cols[c].contains(val)){
                    return false;
                }
                 else{
                    cols[c].add(val);
                }
                int box=(r/3)*3+c/3;
                if(boxs[box].contains(val)){
                    return false;
                }
                else{
                      boxs[box].add(val);
                }

            }
          }
          return true;
    }

}
