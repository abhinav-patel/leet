class Solution {
    public List<Integer> spiralOrder(int[][] matrix)
    {
        int m=matrix.length;
        int n=matrix[0].length;
        
        List<Integer> res=new ArrayList<>();

        int top=0,left=0,bottom=m-1,right=n-1;
        while(true)
        {
            for(int i=left;i<=right;i++)
                res.add(matrix[top][i]);
            top++;
            if(top>bottom ||left>right)
                break;

            for(int i=top;i<=bottom;i++)
                res.add(matrix[i][right]);
            right--;
            if(top>bottom ||left>right)
                break;

            for(int i=right;i>=left;i--)
                res.add(matrix[bottom][i]);
            bottom--;
            if(left>right || top>bottom)
                break;
            
            for(int i=bottom;i>=top;i--)
               res.add(matrix[i][left]);
            left++;
            if(left>right || top>bottom)
                break;
        }
        return res;
        
    }
}