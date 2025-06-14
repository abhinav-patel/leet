class Solution {
    public int shipWithinDays(int[] weights, int days) 
    {
        int low=0,high=0;
        for(int w:weights)
        {
            if(w>low)
               low=w;
            high+=w;
        }

        while(low<high)
        {
            int mid=(low+high)/2;
            int curr=0;
            int reqDays=1;
            for(int w:weights)
            {
                if(curr+w>mid)
                {
                    reqDays++;
                    curr=0;
                }
                curr+=w;
            }
            if(reqDays>days)
               low=mid+1;
            else
               high=mid;
        }
        return low;
    }
}