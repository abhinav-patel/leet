class Solution {
    public int maximumUniqueSubarray(int[] nums) 
    {
        int last[]=new int[10001];
        Arrays.fill(last,-1);

        int prefix[]=new int[nums.length+1];
        prefix[0]=0;
        
        int sum=0;
        for(int l=-1,r=0;r<nums.length;r++)
        {
            prefix[r+1]=nums[r]+prefix[r];
            if(last[nums[r]]>=0)
            {
                l=Math.max(l,last[nums[r]]);
            }
            sum=Math.max(sum,prefix[r+1]-prefix[l+1]);
            last[nums[r]]=r;
        }
        return sum;



        /*int max=0,curr=0;
        HashSet<Integer> s=new HashSet<>();

        for(int l=0,r=0;r<nums.length;r++)
        {
            while(!s.add(nums[r]))
            {
                curr-=nums[l];
                s.remove(nums[l]);
                l++;
            }
            curr+=nums[r];
            max=Math.max(curr,max);
        }
        return max;
        */
    }
}