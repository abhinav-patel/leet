class Solution {
    public int minimumOperations(int[] nums) 
    {
        int i;
        int freq[]=new int[101];
        for(i=nums.length-1;i>=0;i--)
        {
            if(freq[nums[i]]!=0)
               break;
            freq[nums[i]]++;
        }

        return (int)Math.ceil((double)(i+1)/3);    
    }
}