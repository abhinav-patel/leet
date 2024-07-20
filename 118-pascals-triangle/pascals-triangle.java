class Solution {
    public List<List<Integer>> generate(int n) 
    {
        List<List<Integer>> res=new ArrayList<>();

        ArrayList<Integer> first=new ArrayList<>();
        first.add(1);

        ArrayList<Integer> second=new ArrayList<>();
        second.add(1);
        second.add(1);

        if(n==1)
           res.add(first);
        
        else if(n==2)
        {
            res.add(first);
            res.add(second);
        }
        else
        {
            res.add(first);
            res.add(second);
            for(int i=2;i<n;i++)
            {
                ArrayList<Integer> t=new ArrayList<>();
                t.add(1);
                int k=1;
                while(k<=i-1)
                {
                    t.add(res.get(i-1).get(k-1)+res.get(i-1).get(k));
                    k++;
                }
                t.add(1);
                res.add(t);
            }
        }
        return res;
        
    }
}