class Solution {
    public int sumOfEncryptedInt(int[] nums) 
    {
        int sum=0;
        for(int n:nums)
        {
            int temp=0;
            int max=0;
            while(n>0)
            {
                temp=temp*10 +1;
                if(n%10>max)
                   max=n%10;
                n=n/10;
            }
            sum+=(temp*max);
        }
        return sum;
        
    }
}