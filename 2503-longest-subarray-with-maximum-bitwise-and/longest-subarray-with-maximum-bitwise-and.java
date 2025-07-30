class Solution {
    public int longestSubarray(int[] nums) 
    {
        int max=0;
        for(int n:nums)
           max=Math.max(max,n);
           
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max)
            {
                int temp=0;
                while(i<nums.length && nums[i]==max)
                {
                    temp++;
                    //c=Math.max(c,temp);
                    i++;
                }
                c=Math.max(c,temp);
            }
        }
        return c;

        /*int max=0,prev=0,c=0,maxC=0;
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
            prev=n;
        }
        return maxC==0?1:maxC;
        */
        
    }
}