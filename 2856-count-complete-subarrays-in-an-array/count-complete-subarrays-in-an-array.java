class Solution {
    public int countCompleteSubarrays(int[] nums) 
    {
        int n=nums.length;
        Set<Integer> distinct=new HashSet<>();
        for(int k:nums)
            distinct.add(k);
        int distCount=distinct.size();

        Map<Integer,Integer> freq=new HashMap<>();
        int left=0,right=0;
        
        int res=0;

        while(right<n)
        {
            freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);
            while(freq.size()==distCount)
            {
                freq.put(nums[left],freq.getOrDefault(nums[left],0)-1);
                if(freq.get(nums[left])==0)
                   freq.remove(nums[left]);
                left++;
                res+=(n-right-1)+1;
            }
            right++;
        }
        return res;   
    }
}