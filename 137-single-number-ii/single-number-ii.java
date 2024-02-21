class Solution {
    public int singleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int a=nums[0];
        int i=0;
        while(i+2<nums.length)
        {
            if(nums[i]==nums[i+2])
                i=i+3;
            else
                return nums[i];
        }
        return nums[nums.length-1];
    }
}