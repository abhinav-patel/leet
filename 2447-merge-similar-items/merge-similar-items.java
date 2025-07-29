class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) 
    {
        TreeMap<Integer,Integer> map=new TreeMap<>();

        for(int arr[]:items1)
           map.put(arr[0],arr[1]);
        for(int arr[]:items2)
        {
            map.merge(arr[0],arr[1],(a,b)->a+b);
        }
        List<List<Integer>> res=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            res.add(Arrays.asList(e.getKey(),e.getValue()));
        }
        return res;  
    }
}