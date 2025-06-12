class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {
        if((long)m*k>bloomDay.length)
           return -1;

        int low=1,high=1000000000;

        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(isPossible(bloomDay,m,k,mid))
               high=mid;
            else
               low=mid+1;
        }
        return low;
    }
    public boolean isPossible(int bloomDay[],int m,int k,int day)
    {
        int total=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            int c=0;
            while(i<bloomDay.length && c<k && bloomDay[i]<=day)
            {
                c++;
                i++;
            }
            if(c==k)
            {
                total++;
                i--;
            }
            if(total>=m)
            {
                return true;
            }
        }
        return false;

    }
}