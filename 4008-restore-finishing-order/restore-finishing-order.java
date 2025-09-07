class Solution {
    public int[] recoverOrder(int[] order, int[] friends) 
    {

        boolean frie[]=new boolean[order.length+1];
        for(int i:friends)
           frie[i]=true;
        int j=0;
        for(int i:order)
        {
            if(frie[i])
               friends[j++]=i;
        }
        return friends;  
    }
}