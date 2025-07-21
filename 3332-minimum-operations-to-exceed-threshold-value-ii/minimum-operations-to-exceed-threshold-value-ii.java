class Solution {
    public int minOperations(int[] nums, int k) 
    {
        Arrays.sort(nums);
        for(int i=0,j=0,count=0,x,y;;count++)
        {
            if((i<nums.length)&&(j>=count||nums[i]<=nums[j]))
               x=nums[i++];
            else
               x=nums[j++];
            if(x>=k)
               return count;
            
            if((i<nums.length)&&(j>=count||nums[i]<=nums[j]))
               y=nums[i++];
            else
               y=nums[j++];

            long temp=2L*x+y;
            nums[count]=temp<k?(int)temp:k;
        }
        /*PriorityQueue<Integer> pq=new PriorityQueue<>();
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
        */

        
    }
}