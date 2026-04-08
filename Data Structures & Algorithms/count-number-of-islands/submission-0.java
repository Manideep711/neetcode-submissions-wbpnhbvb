class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int visited[][]=new int[row][col];
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(visited[i][j]!=1 && grid[i][j]=='1'){
                    count++;
                    dfs(i,j,row,col,grid,visited);
                    
                }
            }
        }
        return count;
    }
    public void dfs(int i,int j,int row,int col,char[][] grid,int visited[][]){
        if( i<0 || i>=row || j<0 || j>=col ||visited[i][j]==1 || grid[i][j]=='0'){
            return;
        }
          visited[i][j]=1;
          dfs(i+1, j,row,col, grid, visited);
          dfs(i-1, j,row,col, grid, visited);
          dfs(i,j+1,row,col, grid, visited);
          dfs(i, j-1,row,col, grid, visited);

    }
}
