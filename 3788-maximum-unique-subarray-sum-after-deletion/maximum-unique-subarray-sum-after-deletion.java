class Solution {
    public int maxSum(int[] nums) 
    {
        boolean visited[]=new boolean[101];
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int n:nums)
        {
            if(n>max)
               max=n;
            if(n>0 && visited[n]==false)
            {
                sum+=n;
                visited[n]=true;
            }
        }
        return max>=0?sum:max;

        
    }
}