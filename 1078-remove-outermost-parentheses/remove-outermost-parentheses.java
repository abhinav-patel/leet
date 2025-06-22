class Solution {
    public String removeOuterParentheses(String s) 
    {
        StringBuilder str=new StringBuilder();
        int open=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(' && open++>0)
               str.append(ch);
            if(ch==')' && open-->1)
               str.append(ch);
        }
        return str.toString();  
    }
}