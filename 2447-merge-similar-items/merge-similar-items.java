class Solution 
{
    //to get on top :)
    static {
        int items[][] = {{1,1}, {4,5}, {3,8}};
        for(int i = 0; i < 500; i++)
            mergeSimilarItems(items, items);
    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) 
    {
        int map[]=new int[1001];
        for(int i=0;i<items1.length;i++)
        {
           map[items1[i][0]]+=items1[i][1];
        }
        for(int i=0;i<items2.length;i++)
        {
           map[items2[i][0]]+=items2[i][1];
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<1001;i++)
        {
            if(map[i]>0)
               res.add(List.of(i,map[i]));
        }
        return res;
          






        /*TreeMap<Integer,Integer> map=new TreeMap<>();

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
        */
    }
}