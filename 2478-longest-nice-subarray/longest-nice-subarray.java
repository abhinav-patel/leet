class Solution {
    public int longestNiceSubarray(int[] nums) 
    {
        int res=0;
        int left=0;
        int and=0;
        for(int right=0;right<nums.length;right++)
        {
            while((and & nums[right])>0)
               and^=nums[left++];
            and|=nums[right];
            res=Math.max(res,right-left+1);
        }
        return res;
        
    }
}