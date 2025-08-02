class Solution 
{
    // static 
    // {
    //     for (int i = 0; i < 300; i++) 
    //     {
    //         maxSubsequence(new int[1], 1);
    //     }
    // }
    public static int[] maxSubsequence(int[] nums, int k) 
    {
        int n=nums.length;
        if(n==1 || k==n)
           return nums;
        int temp[][]=new int[n][2];
        for(int i=0;i<nums.length;i++)
        {
            temp[i][0]=nums[i];
            temp[i][1]=i;
        }
        Arrays.sort(temp,(a,b)->Integer.compare(b[0],a[0]));
        Arrays.sort(temp,0,k,(a,b)->Integer.compare(a[1],b[1]));

        int res[]=new int[k];
        for(int i=0;i<k;i++)
           res[i]=temp[i][0];
        return res;

        
    }
}