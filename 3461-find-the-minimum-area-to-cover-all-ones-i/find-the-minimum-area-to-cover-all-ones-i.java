class Solution {
    public int minimumArea(int[][] grid) 
    {
        int row=grid.length;
        int col=grid[0].length;
        int mini=1000,minj=1000,maxi=-1,maxj=-1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                {
                    if(i<mini)
                       mini=i;
                    if(i>maxi)
                       maxi=i;
                    if(j<minj)
                       minj=j;
                    if(j>maxj)
                       maxj=j;
                }
            }
        }
        return (maxi-mini+1)*(maxj-minj+1);
        
    }
}