class Solution {
    public int leastInterval(char[] tasks, int n)
    {
        Map<Character,Integer> map=new HashMap<>();

        for(char task:tasks)
        {
            map.put(task,map.getOrDefault(task,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> q=new PriorityQueue<>(
            (a,b)->a.getValue()!=b.getValue() ? b.getValue()-a.getValue(): a.getKey()-b.getKey()); //max heap

        q.addAll(map.entrySet());

        int count=0;

        while(!q.isEmpty())
        {
            int k=n+1;
            List<Map.Entry> temp=new ArrayList<>();
            while(k>0 && !q.isEmpty())
            {
                Map.Entry<Character,Integer> top=q.poll();
                top.setValue(top.getValue()-1);
                temp.add(top);
                k--;
                count++;
            }

            for(Map.Entry<Character,Integer> i:temp)
            {
                if(i.getValue()>0)
                   q.add(i);
            }

            if(q.isEmpty())
               break;
            count=count+k;
        }
        return count;
    }
}