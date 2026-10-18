class Solution {
    public int countDistinctIntegers(int[] nums) 
    {
        Set<Integer> res=new HashSet<Integer>();
        for(int i:nums)
        {
            res.add(i);
            res.add(rev(i));
        }
        return res.size();
    }
    public int rev(int t)
    {
        int temp=0;
        while(t>0)
        {
            int d=t%10;
            temp=temp*10 +d;
            t=t/10;
        }
        return temp;
    }
}