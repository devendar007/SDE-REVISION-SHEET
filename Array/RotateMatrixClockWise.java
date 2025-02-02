class Solution {
    public void reverse(int[] matrix){
        int i=0;
        int j=matrix.length-1;
        while(i<j){
            int temp=matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
      for(int i=1;i<matrix.length;i++){
        for(int j=0;j<i;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
      }  
      for(int[] row:matrix) reverse(row);
    }
}