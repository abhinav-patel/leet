class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>=target) //even for equal we are shifting left
            {
                end=mid-1;
            }
            else{
               start=mid+1;
            }
            if(nums[mid]==target)
               ans[0]=mid;
        }


        start=0;
        end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]<=target) //even for equal we are shifting right
            {
                start=mid+1;
            }
            else
            {
               end=mid-1;
            }
            if(nums[mid]==target)
               ans[1]=mid;
        }
        return ans;
        
        
    }
}