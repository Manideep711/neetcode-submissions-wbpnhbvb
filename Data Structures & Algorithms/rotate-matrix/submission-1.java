class Solution {
    public void rotate(int[][] matrix) {
        //transpose
      int row=matrix.length;
      int column=matrix[0].length;
      for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            if(i==j){
                continue;
            }
            if(i<j){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
      }
      for(int i=0;i<row;i++){
        for(int j=0;j<column/2;j++){
             int temp=matrix[i][column-j-1];
                matrix[i][column-j-1]=matrix[i][j];
                matrix[i][j]=temp;
        }
      }
    }
}
