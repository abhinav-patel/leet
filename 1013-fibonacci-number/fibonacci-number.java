class Solution 
{
    HashMap<Integer,Integer> num=new HashMap<>();
    public int fib(int n) 
    {
        if(n<2)
            return n;
        else if(num.containsKey(n))
            return num.get(n);
        else
        {
            int res=fib(n-1)+fib(n-2);
            num.put(n,res);
            return res;
        }
    }
}