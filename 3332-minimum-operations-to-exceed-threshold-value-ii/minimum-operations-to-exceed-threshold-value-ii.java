class Solution {
    public int minOperations(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int n:nums)
           pq.offer(n);
        for(int i=0,x,y;;i++)
        {
            x=pq.poll();
            if(x>=k)
               return i;
            y=pq.poll();
            long temp=2L*x+y;
            pq.offer(temp<k?(int)temp:k);
        }

        
    }
}