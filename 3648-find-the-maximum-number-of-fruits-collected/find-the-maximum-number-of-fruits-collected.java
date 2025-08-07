class Solution 
{
    int memo[][];
    int n;
    public int maxCollectedFruits(int[][] fruits) 
    {
        int res=0;
        n=fruits.length;
        memo=new int[n][n];
        for(int i=0;i<n;i++)
        {
            res+=fruits[i][i];
            Arrays.fill(memo[i],-1);
            fruits[i][i]=0;
        }
        
        res=res+dfs2(0,n-1,fruits)+dfs3(n-1,0,fruits);
        return res;
    }

    public int dfs2(int i, int j, int fruits[][])
    {
        if(i<0||j<0|| i>=n || j>=n)
            return 0;
        if(memo[i][j]!=-1)
           return memo[i][j];

        int val=fruits[i][j];
        int res=0;

        if(i==j)
           res=Math.max(res,dfs2(i+1,j+1,fruits));
        else if(i==j-1)
        res=Math.max(res,dfs2(i+1,j+1,fruits));
           //res=Math.max(res,Math.max(dfs2(i+1,j,fruits),dfs2(i+1,j+1,fruits)));
                                    //South              //South east
        else
           res=Math.max(res,Math.max(dfs2(i+1,j-1,fruits),Math.max(dfs2(i+1,j,fruits),dfs2(i+1,j+1,fruits))));
                                     //South-west                  //South            //South-East

        return memo[i][j]=res+val;
    }

    public int dfs3(int i, int j, int fruits[][])
    {
        if(i>=n ||i<0||j<0|| j>=n)
           return 0;
        
        if(memo[i][j]!=-1)
           return memo[i][j];

        int val=fruits[i][j];
        int res=0;

        if(i==j)
           res=Math.max(res,dfs3(i+1,j+1,fruits));
                                 
        else if(i-1==j)
        res=Math.max(res,dfs3(i+1,j+1,fruits));
           //res=Math.max(res,Math.max(dfs3(i,j+1,fruits),dfs3(i+1,j+1,fruits)));
        else
           res=Math.max(res,Math.max(dfs3(i-1,j+1,fruits),Math.max(dfs3(i,j+1,fruits),dfs3(i+1,j+1,fruits))));

        return memo[i][j]=res+val;
    }
}