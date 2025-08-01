class Solution 
{
    public void helper(List<List<Integer>> res,int i,int n)
    {
        List<Integer> temp=new ArrayList<>();
        if(i>=n)
           return;
        else if(i==0)
        {
            temp.add(1);
        }
        else
        {
            temp.add(1);
            for(int j=1;j<i;j++)
            {
                temp.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            temp.add(1);
        }
        res.add(temp);
        helper(res,i+1,n);
    }
    public List<List<Integer>> generate(int n) 
    {
        List<List<Integer>> res=new ArrayList<>();
        helper(res,0,n);
        return res;
    }
    // public void helper(List<List<Integer>> res,int i,int n)
    // {
    //     List<Integer> temp=new ArrayList<>();
    //     if(i>=n)
    //        return;
    //     else if(i==0)
    //     {
    //         temp.add(1);
    //     }
    //     else
    //     {
    //         temp.add(1);
    //         for(int j=1;j<i;j++)
    //         {
    //             temp.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
    //         }
    //         temp.add(1);
    //     }
    //     res.add(temp);
    //     helper(res,i+1,n);
    // }
}