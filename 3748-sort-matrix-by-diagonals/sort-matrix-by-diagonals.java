class Solution {
    public int[][] sortMatrix(int[][] grid) 
    {
        //the key is that the (i-j) value is unique for each diagola element that is we can use it
        //as a unique key

        //so we can in a single traversal calculate the key for each element and put in a priority
        //queue

        Map<Integer,PriorityQueue<Integer>> map=new HashMap<>();

        int n=grid.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int key=(i-j);
                map.putIfAbsent(key,(key<0)?new PriorityQueue<Integer>():new PriorityQueue<>(Collections.reverseOrder()));
                map.get(key).offer(grid[i][j]);
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int key=i-j;
                grid[i][j]=map.get(key).poll();
            }
        }
        return grid;
        
        
    }
}