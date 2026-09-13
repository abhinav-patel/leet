class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
        // List<Integer> res=new ArrayList<Integer>();
        // res.add(1);
        // if(rowIndex==0)
        // {
        //     return res;
        // }
        // if(rowIndex==1)
        // {
        //     res.add(1);
        //     return res;
        // }
        // if(rowIndex==2)
        // {
        //     res.add(2);
        //     res.add(1);
        //     return res;
        // }
        // double fact[]=new double[34];
        // fact[0]=1;
        // res.add(rowIndex);
        // for(int i=2;i<34;i++)
        // {
        //     fact[i]=fact[i-1]*i;
        // }
        // for(int i=2;i<rowIndex-1;i++)
        // {
        //     int ans=(int)((fact[rowIndex])/(fact[i]*(fact[rowIndex-i])));
        //     res.add(ans);
        // }
        // res.add(rowIndex);
        // res.add(1);
        // return res;

        List<Integer> res=new ArrayList<>();
        long k=1;
        for(int i=0;i<=rowIndex;i++)
        {
            res.add((int)k);
            k=k*(rowIndex-i)/(i+1);
        }
        return res;
    }
}