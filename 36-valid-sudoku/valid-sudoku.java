class Solution 
{
    public static boolean isValidSudoku(char[][] board) 
    {
        boolean rows[][]=new boolean[10][10];
        boolean columns[][]=new boolean[10][10];

        boolean boxs[][]=new boolean[9][10];

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                //for rows and columns
                char ch=board[i][j];
                if(ch=='.')
                   continue;
                int k=ch-'0';
                if(rows[i][k]==true || columns[j][k]==true)
                   return false;
                rows[i][k]=true;
                columns[j][k]=true;

                //for cecking the sub boxes
                int subrow=i/3;
                int subcolumn=j/3;
                int subIndex=(subrow*3)+subcolumn;
                //formula to calculate the subIndex for the boxes from 0 to 8
                if(boxs[subIndex][k]==true)
                   return false;
                boxs[subIndex][k]=true;

            }
        }
        return true;
        
    }
}