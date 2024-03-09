class Solution {
    public int reverse(int x) 
    {
        long  c=0;
        while(x!=0)
        {
            c=(c*10)+(x%10);
            x=x/10;
        }
        int t=(int)c;
        if(c>Integer.MAX_VALUE||c<Integer.MIN_VALUE)
            return 0;
            
        return t;
        
    }
}