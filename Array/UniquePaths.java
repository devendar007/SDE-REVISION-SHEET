class Solution {
    public int helper(int i,int j,int m,int n){
      if(i==m-1&&j==n-1) return 1;
      if(i>=m||j>=n) return 0;
      int down=helper(i+1,j,m,n);
      int right=helper(i,j+1,m,n);
      return down+right;

    }
    public int uniquePaths(int m, int n) {
        // return helper(0,0,m,n);
        int dp[][]=new int[m+1][n+1];
   
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
             if(i==m-1&&j==n-1) {
                dp[i][j]=1;
                continue;
             }
             int down=dp[i+1][j];
             int right=dp[i][j+1];
             dp[i][j]=down+right;
            }
        }
        return dp[0][0];
    }
}