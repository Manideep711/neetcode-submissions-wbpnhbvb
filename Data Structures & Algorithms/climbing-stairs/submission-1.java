class Solution {
    public int climbStairs(int n) {
      int dp[]=new int[n+1];
      Arrays.fill(dp,-1);
      return dpclimbStairs(n,dp);
    }
    public int dpclimbStairs(int n,int[] dp) {
       if(n<=1){
       dp[n]=1;
       return dp[n];
       }
     if(dp[n]!=-1){
        return dp[n];
     }
     dp[n-1]=dpclimbStairs(n-1,dp);
     dp[n-2]=dpclimbStairs(n-2,dp);
       return dp[n-1]+dp[n-2];
    }
}
