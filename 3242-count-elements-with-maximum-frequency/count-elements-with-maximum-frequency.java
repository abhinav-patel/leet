class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        int arr[]=new int[101];
        int max=0;
        int c=0;
        for(int i:nums)
        {
            arr[i]++;
            if(arr[i]>max)
               max=arr[i];
        }
        for(int k:arr)
        {
            if(k==max)
               c++;
        }
        return c*max;
    }
}