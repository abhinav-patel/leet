class Solution
{
    static {
        int[][] p = {
            {1,3},{3,3},{5,3},{2,2}
        };
        int[][] q = {
            {2,3,1},{4,3,1},{1,1,2}
        };
        for (int i = 0; i < 500; i++) {
            countPoints(p, q);
        }
    }
    public static int[] countPoints(int[][] points, int[][] queries) 
    {
        int n=points.length;
        int m=queries.length;
        int res[]=new int[m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(  Math.sqrt( (queries[i][0]-points[j][0])*(queries[i][0]-points[j][0])+(queries[i][1]-points[j][1])*(queries[i][1]-points[j][1]) )  <=queries[i][2])
                    res[i]++;
            }
        }
        return res;
        
    }
}