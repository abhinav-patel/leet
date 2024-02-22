class Solution 
{
    static HashMap<String,Integer> num=new HashMap<>();
    public int uniquePaths(int m, int n) 
    {
        String key=m +","+n;
        if(num.containsKey(key))
            return num.get(key);
        if(m==0||n==0)
            return 0;
        if(m==1||n==1)
            return 1;
        int res=uniquePaths(m-1,n)+uniquePaths(m,n-1);
        num.put(key,res);
        return res;    
    }
}