class Solution {
    public boolean checkValid(int[][] matrix) 
    {
        int n=matrix.length;
        boolean rows[][]=new boolean[n][n+1];
        boolean columns[][]=new boolean[n][n+1];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int k=matrix[i][j];
                if(rows[i][k]==true || columns[j][k]==true)
                   return false;
                rows[i][k]=true;
                columns[j][k]=true;
            }
        }
        return true;
    }
}