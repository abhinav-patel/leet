class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) 
    {
        Stack<Integer> st=new Stack<>();
        st.push(nums[0]);
        int i=1;
        while(i<nums.length)
        {
            int curr=nums[i];
            while(!st.isEmpty() && gcd(st.peek(),curr)>1)
            {
                curr=lcm(st.pop(),curr);
            }
            
                st.push(curr);
                i++;
        } 
        List<Integer> res=new ArrayList<>();
        while(!st.empty())
           res.add(0,st.pop());
        return res; 
    }
    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public static int lcm(int a,int b)
    {
        return a/gcd(a,b)*b;
    }
}