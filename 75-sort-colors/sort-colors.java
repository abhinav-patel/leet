class Solution 
{
    public void sortColors(int[] nums) 
    {
        int left=0,right=nums.length-1;
        for(int i=0;i<=right;i++)
        {
            if(nums[i]==0)
                swap(nums,i,left++);
            else if(nums[i]==2)
                swap(nums,i--,right--);
        }
    }
    public void swap(int nums[],int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}