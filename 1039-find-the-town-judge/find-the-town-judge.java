class Solution {
    public int findJudge(int n, int[][] trust) 
    {
        int[][] res=new int[n+1][2];
        int k=trust.length;
        for(int i=0;i<k;i++)
        {
            res[trust[i][0]][0]++;
            res[trust[i][1]][1]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(res[i][0]==0 && res[i][1]==n-1)
                return i;
        }
        
        return -1;
        
    }
}