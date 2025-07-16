class Solution {
    public int maximumLength(int[] nums) 
    {
        int odd=0;
        int even=0;
        int alt=0;

        int exp=nums[0]%2;
        for(int i:nums)
        {
            if(i%2==0)
               even++;
            else
               odd++;

            if(i%2==exp)
            {
                alt++;
                exp=1-exp;
            }   
        }
        return Math.max(alt,Math.max(odd,even));
    }
}