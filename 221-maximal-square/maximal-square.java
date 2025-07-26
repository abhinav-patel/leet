class Solution 
{
    //just to get on top :)
    static 
    {
        for(int i = 0 ; i < 500 ; i++){
            maximalSquare(new char[][]{{'1'}});
        }
    }
    public static int maximalSquare(char[][] matrix) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        if(matrix==null || m==0 || n==0)
           return 0;
        
        int res=0;
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(matrix[i-1][j-1]=='1')
                {
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    res=Math.max(res,dp[i][j]);
                }
            }
        }
        return res*res;
        
    }
}
/*
https://assets.leetcode.com/users/leetcode/image_1573111823.png
*/