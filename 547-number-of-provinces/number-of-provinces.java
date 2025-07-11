class Solution 
{
    //Dfs is faster
    
    public int findCircleNum(int[][] isConnected) 
    {
        int v=isConnected.length;
        boolean visited[]=new boolean[v];
        int count=0;

        for(int i=0;i<v;i++)
        {
            if(visited[i]==false)
            {
                count++;
                dfs(isConnected,v,i,visited);
            }
        }
        return count;
    }
    public static void dfs(int isConnected[][],int v,int s,boolean visited[])
    {
        visited[s]=true;
        for(int i=0;i<v;i++)
            {
                if(isConnected[s][i]==1 && visited[i]==false)
                {
                    visited[i]=true;
                    dfs(isConnected,v,i,visited);
                }
            }

    }
    /*
    public static void BFS(int[][] isConnected,int v,int s,boolean visited[])
    {
        Queue<Integer> q=new LinkedList<Integer>();
        visited[s]=true;
        q.add(s);

        while(!q.isEmpty())
        {
            int u=q.poll();
            for(int i=0;i<v;i++)
            {
                if(isConnected[u][i]==1 && visited[i]==false)
                {
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }*/
}