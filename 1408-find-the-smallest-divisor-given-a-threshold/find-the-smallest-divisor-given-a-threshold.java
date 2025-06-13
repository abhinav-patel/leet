class Solution {
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int low=1,high=1000000000;

        while(low<high)
        {
            int mid=(low+high)>>1;
            int sum=0;
            for(int i:nums)
            {
                sum=sum+(i+mid-1)/mid;
                //sum=sum+(int)(Math.ceil(i/mid));
            }
            if(sum>threshold)
               low=mid+1;
            else
               high=mid;
        }
        return low;
    }
}