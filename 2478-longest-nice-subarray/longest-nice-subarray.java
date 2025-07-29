class Solution {
    public int longestNiceSubarray(int[] nums) 
    {
        // int res=0;
        // int left=0;
        // int and=0;
        // for(int right=0;right<nums.length;right++)
        // {
        //     while((and & nums[right])>0)
        //        and^=nums[left++];
        //     and|=nums[right];
        //     res=Math.max(res,right-left+1);
        // }
        // return res;

        int start=0,end=0;
        int res=0;
        int n=nums.length;

        for( end=0;end<n;end++)
        {
            for(int i=start;i<end;i++)
            {
                if((nums[i]&nums[end])!=0)
                {
                    start=i+1;
                }
            }
            res=Math.max(res,end-start+1);
        }
    return res;
    }
}