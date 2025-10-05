class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int n=A.length;
        Set<Integer> setA=new HashSet<>();
        Set<Integer> setB=new HashSet<>();
        int res[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(A[i]==B[i])
               c++;
            else 
            {
                if(setA.contains(B[i]))
                    c++;
                if(setB.contains(A[i]))
                   c++;
            }
            res[i]=c;
            setA.add(A[i]);
            setB.add(B[i]);
        }
        return res;        
    }
}