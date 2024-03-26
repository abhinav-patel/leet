class Solution {
    public int maxSubArray(int[] nums) 
    {
        int max=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=(sum>max)?sum:max;//if(sum>max)
               //max=sum;
            if(sum<0)
               sum=0;
        }

        //if(max<0)
           //max=0;
        return max;
    }
}