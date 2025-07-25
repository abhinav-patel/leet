class Solution {
    public List<List<Integer>> largeGroupPositions(String s) 
    {
        char arr[]=s.toCharArray();
        int start=0,end=0;
        char prev=arr[0];
        int c=1;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==prev)
            {
                c++;
                end=i;
            }
            else
            {
                if(c>=3)
                {
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(start);
                    temp.add(end);
                    res.add(temp);
                }
                start=i;
                end=i;
                prev=arr[i];
                c=1;
            }
        }
        if(c>=3)
            {
                ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(start);
                    temp.add(end);
                    res.add(temp);
            }
        return res;   
    }
}