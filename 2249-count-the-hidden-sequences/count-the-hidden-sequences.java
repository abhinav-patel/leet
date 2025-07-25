class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) 
    {
        long x=0;
        long max=0;
        long min=0;

        for(int n:differences)
        {
            x+=n;
            if(x>max)
               max=x;
            if(x<min)
               min=x;
        }
        return (int)Math.max(0, (upper - lower+1) - (max - min));
        /* Gives TLE for some cases 
        int c=0;
        for(int i=lower;i<=upper;i++)
        {
            boolean flag=true;
            int temp=i;
            for(int j=0;j<differences.length;j++)
            {
                temp+=differences[j];
                if(temp<lower || temp>upper)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
               c++;
        }
        return c;
        */
        
    }
}