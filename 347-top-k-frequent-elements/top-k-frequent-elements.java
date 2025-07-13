class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> heap=new PriorityQueue<>(
            (a,b)->(b.getValue()-a.getValue()));
        
        for(Map.Entry<Integer,Integer> ele: map.entrySet())
        {
            heap.add(ele);
        }
        int n=0;
        int ans[]=new int[k];
        for(;n<k;n++)
        {
            Map.Entry<Integer,Integer> ele=heap.poll();
            ans[n]=ele.getKey();
        }
        return ans;

        
        
    }
}