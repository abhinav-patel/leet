class Solution {
    public double maxAverageRatio(int[][] classes, int extra) 
    {
        PriorityQueue<double[]> maxHeap=new PriorityQueue<>(Comparator.comparingDouble(o-> -o[0]));

        for(int item[]: classes)
        {
            double incr=((item[0]+1.0)/(item[1]+1.0))-(item[0]*1.0/item[1]);
            maxHeap.offer(new double[]{incr,item[0],item[1]});
        }

        while(extra>0)
        {
            double top[]=maxHeap.poll();
            double incr=((top[1]+2.0)/(top[2]+2.0))-((top[1]+1.0)/(top[2]+1.0));
            maxHeap.offer(new double[]{incr,top[1]+1,top[2]+1});
            extra--;
        }

        double ans=0.0d;
        while(maxHeap.isEmpty()==false)
        {
            double top[]=maxHeap.poll();
            ans+=(top[1]*1.0/top[2]);
        }
        return ans/classes.length;   
    }

    
}