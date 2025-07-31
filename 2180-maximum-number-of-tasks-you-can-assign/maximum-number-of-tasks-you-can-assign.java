class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) 
    {
        Arrays.sort(tasks);
        Arrays.sort(workers);

        int low=0;
        int high=Math.min(workers.length,tasks.length);

        while(low<high)
        {
            int mid=(low+high+1)/2;
            if(canAssign(tasks,workers,pills,strength,mid))
            {
                low=mid;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
        
    }

    public boolean canAssign(int tasks[],int workers[],int pills,int strength,int mid)
    {
        Deque<Integer> boosted=new ArrayDeque<>();
        int w=workers.length-1;
        
        for(int i=mid-1; i>=0; i--)
        {
            int task=tasks[i];

            if(!boosted.isEmpty() && boosted.peekFirst()>=task)
            {
                boosted.pollFirst();
            }
            else if(w>=0 && workers[w]>=task)
            {
                w--;
            }
            else
            {
                while(w>=0 && workers[w]+strength>=task)
                {
                    boosted.addLast(workers[w--]);
                }
                if(boosted.isEmpty() || pills==0)
                {
                    return false;
                }
                boosted.pollLast();
                pills--;
            }
        }
        return true;  
    }
}