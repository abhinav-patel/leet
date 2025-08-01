class Solution 
{
    public int maxDiff(int num) 
    {
        String str=Integer.toString(num);
        Set<Character> uD=new HashSet<>();
        int max=num;
        int min=num;

        for(char ch:str.toCharArray())
        {
            uD.add(ch);
        }

        for(char ch:uD)
        {
            for(char i='0'; i<='9'; i++)
            {
                if(str.charAt(0)==ch && i=='0')
                   continue;
                String temp=str.replace(ch,i);
                int tempVal=Integer.parseInt(temp);

                max=Math.max(max,tempVal);
                min=Math.min(min,tempVal);
            }
        }
        return max-min;

        
    }
}