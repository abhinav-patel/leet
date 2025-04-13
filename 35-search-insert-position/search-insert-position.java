class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int i;
        int x=-1;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
               return i;
            if(nums[i]<target)
               x=i;
        }
        return x+1;

        
    }
}