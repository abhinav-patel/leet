class Solution {
    public boolean divideArray(int[] nums) 
    {
        int freq[]=new int[501];
        int n=nums.length;
        int i;
        for(i=0; i<n ; i++)
        {
            freq[nums[i]]++;
        }
        for(i=0; i<501 ; i++)
        {
            if(freq[i]>0 && freq[i]%2!=0)
               return false;
        }
        return true;   
    }
}