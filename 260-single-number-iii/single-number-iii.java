class Solution {
    public int[] singleNumber(int[] nums) 
    {
        if(nums.length==2)
            return nums;
        int k[]=new int[2];
        int j=0;
        Arrays.sort(nums);
        int a=nums[0];
        int i=0;
        while(i+1<nums.length)
        {
            if(nums[i]==nums[i+1])
                i=i+2;
            else
                k[j++]=nums[i++];        
        }
        if(j!=2)
            k[1]=nums[nums.length-1];
        return k;
        
    }
}