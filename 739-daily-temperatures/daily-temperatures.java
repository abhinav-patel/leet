class Solution 
{
    static {
        int [] temp = {30, 60, 90};
        for(int i = 0; i < 500; i++)
            dailyTemperatures(temp);
    }
    public static int[] dailyTemperatures(int[] temp) 
    {
        int n=temp.length;
        int ans[]=new int[n];

        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && temp[st.peek()]<=temp[i])
               st.pop();
            if(st.isEmpty())
            {
                ans[i]=0;
            }
            else
            {
                ans[i]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;    
    }
}