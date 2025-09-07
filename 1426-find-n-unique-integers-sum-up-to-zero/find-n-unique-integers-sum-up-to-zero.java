class Solution 
{
    public int[] sumZero(int n) 
    {
        if(n==1)
           return new int[]{0};
        int arr[]=new int[n];
        int a=0-n/2;
        for(int i=0;i<n;i++)
        {
            if(a==0 && n%2==0)
            {
                a++;
                i--;
                continue;
            }
            arr[i]=a;
            a++;
        }
        return arr;
    }
}