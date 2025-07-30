class Solution 
{
    public int partitionArray(int[] nums, int k) 
    {
        //int n=nums.length;
        int max=-1;
        int min=Integer.MAX_VALUE;

        for(int n:nums)
        {
            if(n>max)
               max=n;
            if(n<min)
               min=n;  
        }
        if(max-min<=k)
           return 1;
        
        boolean temp[]=new boolean[max+1];
        for(int n:nums)
           temp[n]=true;

        int c=1;
        for(int i=min+k+1;i<=max;)
        {
            while(!temp[i++])
            {}
            c++;
            i=i+k;
        }
        return c;

        





        // Arrays.sort(nums);
        // int c=1;
        // int min=nums[0];
        // for(int i=1;i<nums.length;i++)
        // {
        //     if(nums[i]-min>k)
        //     {
        //         c++;
        //         min=nums[i];
        //     }
        // }
        // return c;
        
    }
}