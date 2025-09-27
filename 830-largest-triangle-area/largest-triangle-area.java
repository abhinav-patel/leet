class Solution {
    public double largestTriangleArea(int[][] p) 
    {
        int n=p.length;
        double max=0.0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    double area=0.5*Math.abs(p[i][0]*(p[j][1]-p[k][1])+p[j][0]*(p[k][1]-p[i][1])+p[k][0]*(p[i][1]-p[j][1]));
                    if(area>max)
                       max=area;
                }
            }
        }
        return max;
    }
}