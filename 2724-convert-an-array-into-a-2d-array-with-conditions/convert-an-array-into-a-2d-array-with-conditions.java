class Solution {
    public List<List<Integer>> findMatrix(int[] nums) 
    {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<Integer>());
        for(int i:nums)
        {
            int flag=0;
            for(List<Integer> t:res)
            {
                if(!(t.contains(i)))
                {
                    flag=1;
                    t.add(i);
                    break;
                }
            }
            if(flag==0)
            {
                List<Integer> temp=new ArrayList<>();
                temp.add(i);
                res.add(temp);
            }
        }
        return res;
        
    }
}