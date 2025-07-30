class Solution {
    public long coloredCells(int n) 
    {
        return 2L*n*(n-1)+1;
        // long ans=1;
        // for(int i=2;i<=n;i++)
        //    ans+=(i-1)*4;
        //return ans;
    }
}