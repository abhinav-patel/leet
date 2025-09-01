class Solution {
    public int maxProduct(int[] nums) 
    {
        int a=nums[0];
        int b=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>=a)
            {
                b=a;
                a=nums[i];
            }
            else if(nums[i]>b)
                b=nums[i];
        }
        return (a-1)*(b-1);   
    }
}