import static java.lang.Math.*;
class Solution 
{
    // this solution is very slow
    //mathematical solution is the fastest

    public int leastInterval(char[] tasks, int n)
    {
        int freq[]=new int[26];
        for(char i:tasks)
        {
            freq[i-'A']++;
        }
        int max=0;
        int curr=0;
        int total=0;

        for(int i:freq)
        {
            if(i>max)
            {
                max=i;
                curr=1;
            }
            else if(i==max)
            {
                curr++;
            }
            total=total+i;
        }
        return max(total,(max-1)*(n+1)+curr);
    }

    /*
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
    */
}