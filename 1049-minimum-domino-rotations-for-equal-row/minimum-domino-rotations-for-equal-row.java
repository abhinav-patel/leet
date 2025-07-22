class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) 
    {
        int res=Integer.MAX_VALUE;
        int face[]=new int[7];
        for(int i=0;i<tops.length;i++)
        {
            face[tops[i]]++;
            if(tops[i]!=bottoms[i]);
               face[bottoms[i]]++;
        }
        for(int i=1;i<=6;i++)
        {
            if(face[i]<tops.length)
               continue;
            int top=0,bottom=0;
            boolean possible=true;
            for(int j=0;j<tops.length;j++)
            {
                if(tops[j]!=i && bottoms[j]!=i)
                {
                    possible=false;
                    break;
                }
                if(tops[j]!=i)
                   top++;
                if(bottoms[j]!=i)
                   bottom++;
            }
            if(possible)
               res=Math.min(res,Math.min(top,bottom));
            else return -1;
        }
        return res==Integer.MAX_VALUE?-1:res;
        
    }
}