class Solution 
{
    long dp[];
    public long mostPoints(int[][] questions) 
    {
        dp=new long[questions.length];
        return helperDfs(questions,0);
    }

    public long helperDfs(int questions[][],int i)
    {
        if(i>=questions.length)
           return 0;
        if(dp[i]>0)
           return dp[i];
        return dp[i]=Math.max(helperDfs(questions,i+1), questions[i][0]+helperDfs(questions,i+1+questions[i][1]));
    }
}