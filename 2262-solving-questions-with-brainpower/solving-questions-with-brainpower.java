class Solution 
{
    static {
        int[][] arr = {{3,2},{4,3},{4,4},{2,5}};
        for (int i = 0 ; i < 100 ; i++) mostPoints(arr);
    }
    public static long mostPoints(int[][] questions) 
    {
        long dp[]=new long[questions.length];
        return helperDfs(questions,0,dp);
    }

    public static long helperDfs(int questions[][],int i,long dp[])
    {
        if(i>=questions.length)
           return 0;
        if(dp[i]>0)
           return dp[i];
        return dp[i]=Math.max(helperDfs(questions,i+1,dp), questions[i][0]+helperDfs(questions,i+1+questions[i][1],dp));
    }
}