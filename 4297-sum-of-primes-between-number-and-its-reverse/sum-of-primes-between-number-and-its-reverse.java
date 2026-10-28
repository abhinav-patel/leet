class Solution {
    public int sumOfPrimesInRange(int n) 
    {
        int temp=n;
        int rev=0;
        while(temp>0)
        {
            rev=rev*10 +(temp%10);
            temp=temp/10;
        }
        int max=Math.max(n,rev);
        int min=Math.min(n,rev);
        // if(max==min)
        //     return 0;
        int sum=0;
        for(int i=min;i<=max;i++)
        {
            int c=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    c++;
                    break;
                }
            }
            if(c==0 && i!=0 && i!=1)
            {
                sum=sum+i;
            }
        }
        return sum;
        
        // int sum[]=new int[1001];
        // sum[0]=0;sum[1]=0;sum[2]=2;sum[3]=5;sum[4]=5;sum[5]=10;
        // for(int i=6;i<=1000;i++)
        // {
        //     int c=0;
        //     for(int j=2;j<i;j++)
        //     {
        //         if(i%j==0)
        //         {
        //             c++;
        //             break;
        //         }
        //     }
        //     if(c==0)
        //     {
        //         sum[i]=sum[i-1]+i;
        //     }
        //     else
        //         sum[i]=sum[i-1];
        // }
        // int temp=n;
        // int rev=0;
        // while(temp>0)
        // {
        //     rev=rev*10 +(temp%10);
        //     temp=temp/10;
        // }
        // int max=Math.max(n,rev);
        // int min=Math.min(n,rev);
        // return sum[max]-sum[min]+min;
    }
}