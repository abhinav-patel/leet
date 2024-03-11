class Solution {
    public String customSortString(String order, String s) 
    {
        int count[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            ++count[(int)(s.charAt(i)-'a')];
        }

        StringBuilder result=new StringBuilder();
        for(int i=0;i<order.length();i++)
        {
            char ch=order.charAt(i);
            int idx=(int)(ch-'a');
            int k=count[idx];
            while(count[idx]-->0)
                result.append(ch);
        }
        for (int i = 0; i < 26; ++i) 
        {
        if (count[i] > 0) {
          char ch = (char)(i + 'a');
          for (int j = 0; j < count[i]; ++j) {
            result.append(ch);
          }
        }
      }
      return result.toString();
            
            

        }



        
}
