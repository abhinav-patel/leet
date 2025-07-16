class Solution {
    public int maximumLength(int[] nums) 
    {
        int odd=0,even=0,alt=0,exp=nums[0]%2;
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