class Solution {
    public int longestSubarray(int[] nums) 
    {
        int max=0,prev=0,c=0,maxC=0;
        for(int n:nums)
        {
            if(n>max)
            {
                max=n;
                c=1;
                maxC=1;
            }
            else if(n==max)
            {
                if(n==prev)
                {
                    c++;
                    maxC=Math.max(maxC,c);
                }
                else
                {
                    maxC=Math.max(maxC,c);
                    c=1;
                }
            }
            // else
            //    maxC=Math.max(maxC,c);
            prev=n;
        }
        return maxC==0?1:maxC;
        
    }
}