class Solution 
{
    boolean rows[][]=new boolean[10][10];
    boolean columns[][]=new boolean[10][10];
    boolean boxes[][]=new boolean[9][10];

    public void solveSudoku(char[][] board) 
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                   continue;
                int k=board[i][j]-'0';
                rows[i][k]=true;
                columns[j][k]=true;
                boxes[((i/3)*3)+(j/3)][k]=true;
            }
        }
        solve(board);
    }
    public boolean solve(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char ch='1';ch<='9';ch++)
                    {
                        int k=ch-'0';
                        int boxIndex=((i/3)*3+(j/3));
                        if(rows[i][k]==false && columns[j][k]==false && boxes[boxIndex][k]==false)
                        {
                            board[i][j]=ch;
                            rows[i][k]=true;
                            columns[j][k]=true;
                            boxes[boxIndex][k]=true;

                            if(solve(board))
                               return true;
                            board[i][j]='.';
                            rows[i][k]=false;
                            columns[j][k]=false;
                            boxes[boxIndex][k]=false;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

}