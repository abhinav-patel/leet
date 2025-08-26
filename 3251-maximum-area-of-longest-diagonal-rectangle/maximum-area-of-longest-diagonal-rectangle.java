class Solution 
{
    public int areaOfMaxDiagonal(int[][] dim) 
    {
        int max=0;
        double maxDiag=Math.sqrt(Math.pow(dim[0][0],2)+Math.pow(dim[0][1],2));
        for(int i=1;i<dim.length;i++)
        {
            double diag=Math.sqrt(Math.pow(dim[i][0],2)+Math.pow(dim[i][1],2));
            if(diag>maxDiag)
            {
                max=i;
                maxDiag=diag;
            }
            else if(diag==maxDiag && ((dim[max][0]*dim[max][1])<(dim[i][0]*dim[i][1])))
            {
                max=i;
                maxDiag=diag;
            }
        }
        return dim[max][0]*dim[max][1];
    }
}