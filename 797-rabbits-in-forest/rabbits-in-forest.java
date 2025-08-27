class Solution {
    public int numRabbits(int[] ans) 
    {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i:ans)
           freq.put(i,freq.getOrDefault(i,0)+1);

        int res=0;
        for(Map.Entry<Integer,Integer> p: freq.entrySet())
           res+=Math.ceil((double)p.getValue()/(p.getKey()+1))*(p.getKey()+1);
        
        return res;    
    }
}