class Solution 
{
    public String getPermutation(int n, int k)
    {
        List<Integer> fact=new ArrayList<>();
        fact.add(1);
        fact.add(1);
        fact.add(2);
        fact.add(6);
        fact.add(24);
        fact.add(120);
        fact.add(720);
        fact.add(5040);
        fact.add(40320);
        fact.add(362880);  

        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<=n;i++)
           nums.add(i);
        StringBuilder res=new StringBuilder("");
        get(n,k,fact,nums,res);
        return res.toString();
    }
    void get(int n,int k,List<Integer> fact,List<Integer> nums,StringBuilder res)
    {
        if(n==1)
        {
           res=res.append(Integer.toString(nums.get(0)).charAt(0));
           return;
        }
        int index=(k/fact.get(n-1));
        if(k%fact.get(n-1)==0)
           index--;

        res=res.append(Integer.toString(nums.get(index)).charAt(0));
        nums.remove(index);

        k-=fact.get(n-1)*index;
        get(n-1,k,fact,nums,res);
    }
}