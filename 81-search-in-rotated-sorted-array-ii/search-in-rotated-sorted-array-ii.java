class Solution {
    public boolean search(int[] nums, int target) 
    {int start=0,end=nums.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(nums[mid]==target)
               return true;

            if(nums[start]==nums[mid] && nums[mid]==nums[end])//change for duplicates
            {
                start++;
                end--;
            }

            else if(nums[mid]>=nums[start])
            {
                if(target>=nums[start] && target<nums[mid])
                   end=mid-1;
                else
                   start=mid+1;
            }
            else
            {
                if(target>nums[mid] && target<=nums[end])
                   start=mid+1;
                else
                   end=mid-1;
            }
        }
        return false;
    }
}