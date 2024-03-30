class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) 
    {
        int res=0;
        int n=nums.length;
        int c[]=new int[n+1];
        for(int l=0,m=0,r=0;r<n;r++)
        {
            if(++c[nums[r]]==1)
            {
                if(--k<0)
                {
                    c[nums[m++]]=0;
                    l=m;
                }
            }
            if(k<=0)
            {
                while(c[nums[m]]>1)
                   --c[nums[m++]];
                res=res+m-l+1;
            }
        }
        return res;
    }
}