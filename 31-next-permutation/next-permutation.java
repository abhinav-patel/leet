class Solution 
{
    public static void rev(int nums[],int low,int high)
    {
        while(low<high)
        {
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }

    public void nextPermutation(int[] nums) 
    {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            rev(nums,0,n-1);
        }
        else
        {
            for(int i=n-1;i>=index;i--)
            {
                if(nums[i]>nums[index])
                {
                    int temp=nums[i];
                    nums[i]=nums[index];
                    nums[index]=temp;
                    break;
                }
            }
            rev(nums,index+1,n-1);
        }
    }
}