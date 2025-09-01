class Solution {
    public double maxAverageRatio(int[][] classes, int extra) 
    {
        PriorityQueue<double[]> maxHeap=new PriorityQueue<>(Comparator.comparingDouble(o-> -o[0]));

        for(int item[]: classes)
        {
            maxHeap.offer(new double[]{increment(item[0],item[1]),item[0],item[1]});
        }

        while(extra>0)
        {
            double top[]=maxHeap.poll();
            maxHeap.offer(new double[]{increment(top[1]+1,top[2]+1),top[1]+1,top[2]+1});
            extra--;
        }

        double ans=0.0d;
        while(maxHeap.isEmpty()==false)
        {
            double top[]=maxHeap.poll();
            ans+=(top[1]/top[2]);
        }
        return ans/classes.length;   
    }

    public double increment(double a,double b)
    {
        return ((a+1)/(b+1))-(a/b);
    }
}