class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        boolean rows[][]=new boolean[10][10];
        boolean columns[][]=new boolean[10][10];

        boolean boxs[][]=new boolean[9][10];


        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char ch=board[i][j];
                if(ch=='.')
                   continue;
                int k=ch-'0';
                if(rows[i][k]==true || columns[j][k]==true)
                   return false;
                rows[i][k]=true;
                columns[j][k]=true;

                int subrow=i/3;
                int subcolumn=j/3;
                int subIndex=(subrow*3)+subcolumn;
                if(boxs[subIndex][k]==true)
                   return false;
                boxs[subIndex][k]=true;

            }
        }
        return true;
        
    }
}