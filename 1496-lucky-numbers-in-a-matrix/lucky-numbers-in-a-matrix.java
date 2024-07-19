class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) 
    {
        List<Integer> res =new ArrayList<Integer>();
        int r=matrix.length;
        int c=matrix[0].length;
        
        Integer rowmin[]=new Integer[r];
        Integer colmax[]=new Integer[c];

        for(int i=0;i<r;i++)
        {
            rowmin[i]=matrix[i][0];
        }
        for(int i=0;i<c;i++)
        {
            colmax[i]=matrix[0][i];
        }
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                rowmin[i]=Math.min(rowmin[i],matrix[i][j]);
                colmax[j]=Math.max(colmax[j],matrix[i][j]);
            }
        }
        /*for(int i=0;i<c;i++)
        {
            System.out.println(colmax[i]);
        }
        for(int i=0;i<r;i++)
        {
            System.out.println(rowmin[i]);
        }*/
        for(int i=0;i<r;i++)
        {
            if(Arrays.asList(colmax).contains(rowmin[i]))
                res.add(rowmin[i]);
        }
        //System.out.println(res);
        return res;    
    }
}