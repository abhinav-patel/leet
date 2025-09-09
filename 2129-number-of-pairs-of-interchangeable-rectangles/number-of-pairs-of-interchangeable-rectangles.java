class Solution {
    public long interchangeableRectangles(int[][] rectangles) 
    {
        HashMap<Double,Long> map=new HashMap<>();
        for(int i[]:rectangles)
        {
            double r=(double)i[0]/(double)i[1];
            map.put(r,map.getOrDefault(r,0L)+1);
        }
        long sum=0;
        for(Map.Entry<Double,Long> m:map.entrySet())
        {
            long k=m.getValue();
            sum+=((k*(k-1))/2);
        }        
        return sum;
    }
}