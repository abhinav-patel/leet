class Solution 
{
    ArrayList<Integer> num=new ArrayList<Integer>();
    public int fib(int n) 
    {
        if(n<2)
            return n;
        if(n<=num.size())
           return num.get(n);
        else if(n==num.size()+1)
        {
            num.add(num.get(n-1)+num.get(n-2));
            return num.get(n-1)+num.get(n-2);
        }
        else
           return fib(n-1)+fib(n-2);

    }
}