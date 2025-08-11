class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        int a =0, b=0, c=0;
        for(int n:bills)
        {
            if(n==5)
               a++;
            else if(n==10)
            {
                if(a>0)
                {
                    a--;
                    b++;
                }
                else
                   return false;
            }
            else
            {
                if(b>0 && a>0)
                {
                    b--;
                    a--;
                    c++;
                }
                else if(a>=3)
                {
                    a=a-3;
                }
                else
                   return false;
            }
        }
        return true;   
    }
}