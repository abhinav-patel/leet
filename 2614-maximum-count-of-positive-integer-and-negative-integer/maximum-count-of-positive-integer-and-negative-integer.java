class Solution {
    public int maximumCount(int[] nums) {
        int negCount;
        int posCount;
        int n = nums.length;
        //finding last neg num
        int left = 0, right = n - 1;
        while (left <= right) 
        {
            int mid = (left + right) / 2;
            if (nums[mid] <0) 
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        negCount=right+1;
        //finding first positive number
        left = 0;
        right = n - 1;
        while (left <= right) 
        {
            int mid = (left + right) / 2;
            if (nums[mid] >0) 
            {
                right = mid - 1;
            }
            else
            {
                left=mid+1;
            }
        }
        posCount=n-left;
        return Math.max(negCount,posCount);
    }
}