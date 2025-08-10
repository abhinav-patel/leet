class Solution {
    public boolean reorderedPowerOf2(int n) 
    {
        char arr[]=String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        String s=new String(arr);

        for(int i=0;i<31;i++)
        {
            char temp[]=String.valueOf((int)1<<i).toCharArray();
            Arrays.sort(temp);
            String s2=new String(temp);
            if(s.equals(s2))
               return true;
        }
        return false;
        
    }
}