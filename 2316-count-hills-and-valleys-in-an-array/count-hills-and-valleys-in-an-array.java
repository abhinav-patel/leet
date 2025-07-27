class Solution {
    public int countHillValley(int[] nums) 
    {
        int prev=nums[0],curr=nums[1],next=nums[2];
        int c=0;
        for(int i=1;i<nums.length-1;i++)
        {
            prev=nums[i-1];
            curr=nums[i];
            next=nums[i+1];
            while(curr==prev && i<nums.length-2)
            {
                i++;
                curr=nums[i];
                next=nums[i+1];
            }
            while(curr==next && i<nums.length-2)
            {
                i++;
                next=nums[i+1];
            }
            if((curr>prev&&curr>next)||curr<next&&curr<prev)
               c++;
        }
        return c;
        
    }
}