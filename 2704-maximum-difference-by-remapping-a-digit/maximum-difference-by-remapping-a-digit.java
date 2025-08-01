class Solution {
    public int minMaxDifference(int num) 
    {
        String str = Integer.toString(num);
        if(str.length()==1)
           return 9;
        StringBuilder min = new StringBuilder("");
        StringBuilder max = new StringBuilder("");

        char ch=str.charAt(0);
        char ch2='n';
        if(str.charAt(0)!='9')
           ch2=str.charAt(0);
        for (int i = 1; i < str.length(); i++) 
        {
            if(!Character.isDigit(ch2) && str.charAt(i)!='9')
               ch2=str.charAt(i);
            if(str.charAt(i)==ch)
               min.append('0');
            else 
               min.append(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) 
        {
            if(str.charAt(i)==ch2)
               max.append('9');
            else 
               max.append(str.charAt(i));
        }
        //String m1=()
        return (Integer.parseInt(max.toString())-Integer.parseInt(min.toString()));
    }

}
/*int min=0,max=0;
        int temp=num;
        int len=0;
        while(num>0)
        {
            len++;
            num=num/10;
        }
        num=temp;
        int k=num/(Math.pow(10,len-1));
        while(num>0)
        {
            int t=num%10;
            if()
        }
        */