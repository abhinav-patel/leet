class Solution {
    public int[] closestPrimes(int left, int right) 
    {
        boolean primes[]=new boolean[right+1];
        Arrays.fill(primes,true);

        for(int i=2; i*i<=right; i++)
        {
            if(primes[i]==true)
            {
                for(int j=i*i; j<=right; j+=i)
                   primes[j]=false;
            }
        }
        int prev=-1;
        int a=-1,b=-1;
        int diff=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++)
        {
            if(i<2)
               continue;
            if(primes[i]==true)
            {
                if(prev==-1)
                {
                    prev=i;
                    continue;
                }
                else
                {
                    if(i-prev <=2)
                        return new int[]{prev,i};
                    

                    
                    if(i-prev<diff)
                    {
                        diff=i-prev;
                        a=prev;
                        b=i;
                       // prev=i;
                    }
                    prev=i;
                    
                }
            }
        }
        return new int[]{a,b};    
    }
}