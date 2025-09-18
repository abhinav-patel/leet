class Solution {
    public int countLargestGroup(int n) 
    {
        int arr[]=new int[37];
        int max=0;
        for(int i=1;i<=n;i++)
        {
            int s=sum(i);
            arr[s]++;
            if(arr[s]>max)
               max=arr[s];
        }
        int c=0;
        for(int k:arr)
        {
            if(k==max)
               c++;
        }
        return c;
        
    }
    static int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=(n%10);
            n=n/10;
        }
        return s;
    }
}