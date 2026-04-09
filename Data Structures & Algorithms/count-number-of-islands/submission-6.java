class Solution {
    public int numIslands(char[][] grid) {
          int row=grid.length;
       int col=grid[0].length;
       int count=0;
       boolean visited[][]=new boolean[row][col];
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(!visited[i][j]&& grid[i][j]=='1'){
                dfs(i,j,grid,visited);
                count++;
            }
        }
       }
       return count;
    }
    public void dfs(int i,int j,char[][] grid,boolean[][] visited){
       int row=visited.length;
       int col=visited[0].length;
       if(i<0 || i>=row || j<0 || j>=col ||visited[i][j] || grid[i][j]=='0'){
        return;
       } 
       visited[i][j]=true;
       dfs(i+1,j,grid,visited);
       dfs(i-1,j,grid,visited);
       dfs(i,j+1,grid,visited);
       dfs(i,j-1,grid,visited);
    }
}
