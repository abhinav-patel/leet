class Solution {
    public int maximumDifference(int[] nums) 
    {
        int preMin[]=new int[nums.length];
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            preMin[i]=min;
            if(nums[i]<min)
               min=nums[i];
        }
        int max=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-preMin[i]>max)
               max=nums[i]-preMin[i];   
        }
        return max>0?max:-1;   
    }
}