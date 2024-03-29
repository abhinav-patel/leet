class Solution {
    public int majorityElement(int[] nums) 
    {
        if(nums.length==1||nums.length==2)
            return nums[0];
        int c=0,element=0;
        for(int i=0;i<nums.length;i++)
        {
            if(c>Math.floor(nums.length/2))
               return element;
            if(c==0)
            {
                element=nums[i];
                c++;
            }
            else if(nums[i]==element)
               c++;

            else
               c--;
        }
        return element;
        
    }
}