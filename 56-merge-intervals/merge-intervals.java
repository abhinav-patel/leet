class Solution {
    public int[][] merge(int[][] intervals) 
    {
        if(intervals.length<=1)
           return intervals;
        
        Arrays.sort(intervals,(i1,i2)->Integer.compare(i1[0],i2[0]));

        List<int[]> result=new ArrayList<>();

        int curr[]=intervals[0];
        result.add(curr);

        for(int interval[]:intervals)
        {
            if(interval[0]<=curr[1])
               curr[1]=Math.max(interval[1],curr[1]);
            else
            {
                curr=interval;
                result.add(curr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}