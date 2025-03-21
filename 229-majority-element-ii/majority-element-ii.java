class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        //Boyer-Moore majority votinng algo
        int a=0,b=0,avote=0,bvote=0;
        //first pass is for choosing the candidates
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==a)
            {
                avote++;
            }
            else if(nums[i]==b)
            {
                bvote++;
            }
            else if(avote==0)
            {
                avote++;
                a=nums[i];
            }
            else if(bvote==0)
            {
                bvote=1;
                b=nums[i];
            }
            else
            {
                avote--;
                bvote--;
            }
        }
        avote=0;
        bvote=0;

        //Second pass to count the frequencies
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==a)avote++;
            else if(nums[i]==b)bvote++;
        }

        List<Integer> res=new ArrayList<>();
        if(avote>Math.floor(nums.length/3))
           res.add(a);
        if(bvote>Math.floor(nums.length/3))
           res.add(b);

        return res;
    }
}